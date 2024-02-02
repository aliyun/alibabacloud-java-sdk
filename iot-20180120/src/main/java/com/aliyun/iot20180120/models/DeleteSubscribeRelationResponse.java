// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubscribeRelationResponseBody body;

    public static DeleteSubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribeRelationResponse self = new DeleteSubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubscribeRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubscribeRelationResponse setBody(DeleteSubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
