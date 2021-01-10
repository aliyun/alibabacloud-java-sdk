// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOpenAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOpenAccountsResponseBody body;

    public static ListOpenAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenAccountsResponse self = new ListOpenAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenAccountsResponse setBody(ListOpenAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenAccountsResponseBody getBody() {
        return this.body;
    }

}
