// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFoundationVersionsResponseBody body;

    public static ListFoundationVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionsResponse self = new ListFoundationVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoundationVersionsResponse setBody(ListFoundationVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoundationVersionsResponseBody getBody() {
        return this.body;
    }

}
