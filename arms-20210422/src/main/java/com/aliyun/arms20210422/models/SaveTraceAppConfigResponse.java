// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SaveTraceAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveTraceAppConfigResponseBody body;

    public static SaveTraceAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTraceAppConfigResponse self = new SaveTraceAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveTraceAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTraceAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTraceAppConfigResponse setBody(SaveTraceAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTraceAppConfigResponseBody getBody() {
        return this.body;
    }

}
