// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SaveRTCStatsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveRTCStatsV2ResponseBody body;

    public static SaveRTCStatsV2Response build(java.util.Map<String, ?> map) throws Exception {
        SaveRTCStatsV2Response self = new SaveRTCStatsV2Response();
        return TeaModel.build(map, self);
    }

    public SaveRTCStatsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveRTCStatsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveRTCStatsV2Response setBody(SaveRTCStatsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveRTCStatsV2ResponseBody getBody() {
        return this.body;
    }

}
