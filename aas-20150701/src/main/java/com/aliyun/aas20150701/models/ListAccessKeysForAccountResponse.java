// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ListAccessKeysForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessKeysForAccountResponseBody body;

    public static ListAccessKeysForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysForAccountResponse self = new ListAccessKeysForAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessKeysForAccountResponse setBody(ListAccessKeysForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessKeysForAccountResponseBody getBody() {
        return this.body;
    }

}
