// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAccessKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessKeysResponseBody body;

    public static ListAccessKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysResponse self = new ListAccessKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessKeysResponse setBody(ListAccessKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessKeysResponseBody getBody() {
        return this.body;
    }

}
