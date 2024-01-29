// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCategoryResponseBody body;

    public static DescribeCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryResponse self = new DescribeCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCategoryResponse setBody(DescribeCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCategoryResponseBody getBody() {
        return this.body;
    }

}
