// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ChangeDingTalkIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeDingTalkIdResponseBody body;

    public static ChangeDingTalkIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDingTalkIdResponse self = new ChangeDingTalkIdResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDingTalkIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDingTalkIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDingTalkIdResponse setBody(ChangeDingTalkIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDingTalkIdResponseBody getBody() {
        return this.body;
    }

}
