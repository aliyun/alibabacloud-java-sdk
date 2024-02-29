// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSceneCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSceneCategoryResponseBody body;

    public static ListSceneCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSceneCategoryResponse self = new ListSceneCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListSceneCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSceneCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSceneCategoryResponse setBody(ListSceneCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSceneCategoryResponseBody getBody() {
        return this.body;
    }

}
