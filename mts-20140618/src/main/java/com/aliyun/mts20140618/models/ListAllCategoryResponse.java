// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAllCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllCategoryResponseBody body;

    public static ListAllCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllCategoryResponse self = new ListAllCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAllCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllCategoryResponse setBody(ListAllCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllCategoryResponseBody getBody() {
        return this.body;
    }

}
