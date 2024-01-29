// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class LinkInstanceCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LinkInstanceCategoryResponseBody body;

    public static LinkInstanceCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        LinkInstanceCategoryResponse self = new LinkInstanceCategoryResponse();
        return TeaModel.build(map, self);
    }

    public LinkInstanceCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LinkInstanceCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LinkInstanceCategoryResponse setBody(LinkInstanceCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public LinkInstanceCategoryResponseBody getBody() {
        return this.body;
    }

}
