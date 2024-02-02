// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubscribeRelationResponseBody body;

    public static CreateSubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribeRelationResponse self = new CreateSubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscribeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscribeRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubscribeRelationResponse setBody(CreateSubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
