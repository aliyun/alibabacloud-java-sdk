// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSetsResponseBody body;

    public static ListSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSetsResponse self = new ListSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSetsResponse setBody(ListSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSetsResponseBody getBody() {
        return this.body;
    }

}
