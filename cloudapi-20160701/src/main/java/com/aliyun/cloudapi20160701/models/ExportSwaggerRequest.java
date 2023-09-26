// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ExportSwaggerRequest extends TeaModel {
    @NameInMap("ApiUid")
    public String apiUid;

    @NameInMap("DataFormat")
    public String dataFormat;

    public static ExportSwaggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSwaggerRequest self = new ExportSwaggerRequest();
        return TeaModel.build(map, self);
    }

    public ExportSwaggerRequest setApiUid(String apiUid) {
        this.apiUid = apiUid;
        return this;
    }
    public String getApiUid() {
        return this.apiUid;
    }

    public ExportSwaggerRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

}
