// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyDbsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBodyDbsResponseBody body;

    public static ListBodyDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBodyDbsResponse self = new ListBodyDbsResponse();
        return TeaModel.build(map, self);
    }

    public ListBodyDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBodyDbsResponse setBody(ListBodyDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBodyDbsResponseBody getBody() {
        return this.body;
    }

}
