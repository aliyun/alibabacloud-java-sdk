// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class ListInstanceTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceTableResponseBody body;

    public static ListInstanceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTableResponse self = new ListInstanceTableResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceTableResponse setBody(ListInstanceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceTableResponseBody getBody() {
        return this.body;
    }

}
