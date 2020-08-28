// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterOutputRequest extends TeaModel {
    @NameInMap("DestName")
    @Validation(required = true)
    public String destName;

    @NameInMap("ConfigJson")
    @Validation(required = true)
    public String configJson;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DestType")
    public String destType;

    public static PutExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterOutputRequest self = new PutExporterOutputRequest();
        return TeaModel.build(map, self);
    }

}
