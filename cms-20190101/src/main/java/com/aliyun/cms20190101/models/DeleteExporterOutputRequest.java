// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterOutputRequest extends TeaModel {
    @NameInMap("DestName")
    public String destName;

    public static DeleteExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterOutputRequest self = new DeleteExporterOutputRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExporterOutputRequest setDestName(String destName) {
        this.destName = destName;
        return this;
    }
    public String getDestName() {
        return this.destName;
    }

}
