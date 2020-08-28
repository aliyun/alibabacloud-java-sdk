// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterOutputRequest extends TeaModel {
    @NameInMap("DestName")
    @Validation(required = true)
    public String destName;

    public static DeleteExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterOutputRequest self = new DeleteExporterOutputRequest();
        return TeaModel.build(map, self);
    }

}
