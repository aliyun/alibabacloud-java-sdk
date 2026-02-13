// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceGetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AISearchResourceGetListResponseBody body;

    public static AISearchResourceGetListResponse build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceGetListResponse self = new AISearchResourceGetListResponse();
        return TeaModel.build(map, self);
    }

    public AISearchResourceGetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AISearchResourceGetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AISearchResourceGetListResponse setBody(AISearchResourceGetListResponseBody body) {
        this.body = body;
        return this;
    }
    public AISearchResourceGetListResponseBody getBody() {
        return this.body;
    }

}
