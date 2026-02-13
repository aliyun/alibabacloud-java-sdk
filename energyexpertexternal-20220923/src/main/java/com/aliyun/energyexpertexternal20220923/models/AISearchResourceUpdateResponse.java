// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AISearchResourceUpdateResponseBody body;

    public static AISearchResourceUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceUpdateResponse self = new AISearchResourceUpdateResponse();
        return TeaModel.build(map, self);
    }

    public AISearchResourceUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AISearchResourceUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AISearchResourceUpdateResponse setBody(AISearchResourceUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public AISearchResourceUpdateResponseBody getBody() {
        return this.body;
    }

}
