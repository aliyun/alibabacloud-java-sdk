// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AISearchResourceAddResponseBody body;

    public static AISearchResourceAddResponse build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceAddResponse self = new AISearchResourceAddResponse();
        return TeaModel.build(map, self);
    }

    public AISearchResourceAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AISearchResourceAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AISearchResourceAddResponse setBody(AISearchResourceAddResponseBody body) {
        this.body = body;
        return this;
    }
    public AISearchResourceAddResponseBody getBody() {
        return this.body;
    }

}
