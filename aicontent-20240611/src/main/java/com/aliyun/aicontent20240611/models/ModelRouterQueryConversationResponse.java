// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryConversationResponseBody body;

    public static ModelRouterQueryConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryConversationResponse self = new ModelRouterQueryConversationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryConversationResponse setBody(ModelRouterQueryConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryConversationResponseBody getBody() {
        return this.body;
    }

}
