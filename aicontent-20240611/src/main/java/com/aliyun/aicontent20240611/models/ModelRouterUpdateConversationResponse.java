// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateConversationResponseBody body;

    public static ModelRouterUpdateConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateConversationResponse self = new ModelRouterUpdateConversationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateConversationResponse setBody(ModelRouterUpdateConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateConversationResponseBody getBody() {
        return this.body;
    }

}
