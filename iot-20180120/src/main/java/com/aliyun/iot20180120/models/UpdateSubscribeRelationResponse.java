// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSubscribeRelationResponseBody body;

    public static UpdateSubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribeRelationResponse self = new UpdateSubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubscribeRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubscribeRelationResponse setBody(UpdateSubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
