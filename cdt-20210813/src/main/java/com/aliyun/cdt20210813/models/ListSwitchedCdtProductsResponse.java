// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListSwitchedCdtProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSwitchedCdtProductsResponseBody body;

    public static ListSwitchedCdtProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwitchedCdtProductsResponse self = new ListSwitchedCdtProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListSwitchedCdtProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwitchedCdtProductsResponse setBody(ListSwitchedCdtProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwitchedCdtProductsResponseBody getBody() {
        return this.body;
    }

}
