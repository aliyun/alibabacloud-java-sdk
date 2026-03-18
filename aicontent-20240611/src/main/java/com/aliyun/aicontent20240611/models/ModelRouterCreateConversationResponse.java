// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateConversationResponseBody body;

    public static ModelRouterCreateConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateConversationResponse self = new ModelRouterCreateConversationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateConversationResponse setBody(ModelRouterCreateConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateConversationResponseBody getBody() {
        return this.body;
    }

}
