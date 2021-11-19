// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListPopVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPopVersionsResponseBody body;

    public static ListPopVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPopVersionsResponse self = new ListPopVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPopVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPopVersionsResponse setBody(ListPopVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPopVersionsResponseBody getBody() {
        return this.body;
    }

}
