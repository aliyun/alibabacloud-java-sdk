// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryConversationListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryConversationListResponseBody body;

    public static ModelRouterQueryConversationListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryConversationListResponse self = new ModelRouterQueryConversationListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryConversationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryConversationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryConversationListResponse setBody(ModelRouterQueryConversationListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryConversationListResponseBody getBody() {
        return this.body;
    }

}
