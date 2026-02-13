// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AISearchResourceDeleteResponseBody body;

    public static AISearchResourceDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceDeleteResponse self = new AISearchResourceDeleteResponse();
        return TeaModel.build(map, self);
    }

    public AISearchResourceDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AISearchResourceDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AISearchResourceDeleteResponse setBody(AISearchResourceDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public AISearchResourceDeleteResponseBody getBody() {
        return this.body;
    }

}
