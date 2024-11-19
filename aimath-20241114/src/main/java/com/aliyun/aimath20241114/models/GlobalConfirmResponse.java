// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GlobalConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalConfirmResponseBody body;

    public static GlobalConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalConfirmResponse self = new GlobalConfirmResponse();
        return TeaModel.build(map, self);
    }

    public GlobalConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalConfirmResponse setBody(GlobalConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalConfirmResponseBody getBody() {
        return this.body;
    }

}
