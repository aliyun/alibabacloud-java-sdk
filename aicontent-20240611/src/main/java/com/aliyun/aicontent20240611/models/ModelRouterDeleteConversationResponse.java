// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterDeleteConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterDeleteConversationResponseBody body;

    public static ModelRouterDeleteConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterDeleteConversationResponse self = new ModelRouterDeleteConversationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterDeleteConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterDeleteConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterDeleteConversationResponse setBody(ModelRouterDeleteConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterDeleteConversationResponseBody getBody() {
        return this.body;
    }

}
