// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListUnreachableContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUnreachableContactsResponseBody body;

    public static ListUnreachableContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnreachableContactsResponse self = new ListUnreachableContactsResponse();
        return TeaModel.build(map, self);
    }

    public ListUnreachableContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnreachableContactsResponse setBody(ListUnreachableContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnreachableContactsResponseBody getBody() {
        return this.body;
    }

}
