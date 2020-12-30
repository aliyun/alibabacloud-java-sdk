// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMembersResponseBody body;

    public static ListMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMembersResponse self = new ListMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMembersResponse setBody(ListMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMembersResponseBody getBody() {
        return this.body;
    }

}
