// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCdtProductsResponseBody body;

    public static ListCdtProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCdtProductsResponse self = new ListCdtProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListCdtProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCdtProductsResponse setBody(ListCdtProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCdtProductsResponseBody getBody() {
        return this.body;
    }

}
