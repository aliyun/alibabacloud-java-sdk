// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOpenAccountLinksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOpenAccountLinksResponseBody body;

    public static ListOpenAccountLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenAccountLinksResponse self = new ListOpenAccountLinksResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenAccountLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenAccountLinksResponse setBody(ListOpenAccountLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenAccountLinksResponseBody getBody() {
        return this.body;
    }

}
