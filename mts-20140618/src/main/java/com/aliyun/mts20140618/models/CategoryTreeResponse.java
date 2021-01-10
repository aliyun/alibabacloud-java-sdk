// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CategoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CategoryTreeResponseBody body;

    public static CategoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        CategoryTreeResponse self = new CategoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public CategoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CategoryTreeResponse setBody(CategoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public CategoryTreeResponseBody getBody() {
        return this.body;
    }

}
