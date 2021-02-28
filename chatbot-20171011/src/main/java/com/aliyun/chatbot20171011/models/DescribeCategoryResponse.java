// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCategoryResponse setBody(DescribeCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCategoryResponseBody getBody() {
        return this.body;
    }

}
