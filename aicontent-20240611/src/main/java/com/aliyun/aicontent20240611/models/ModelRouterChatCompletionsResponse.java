// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterChatCompletionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterChatCompletionsResponseBody body;

    public static ModelRouterChatCompletionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterChatCompletionsResponse self = new ModelRouterChatCompletionsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterChatCompletionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterChatCompletionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterChatCompletionsResponse setBody(ModelRouterChatCompletionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterChatCompletionsResponseBody getBody() {
        return this.body;
    }

}
