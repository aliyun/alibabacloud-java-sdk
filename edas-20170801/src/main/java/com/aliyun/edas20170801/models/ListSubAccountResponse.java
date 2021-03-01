// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSubAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubAccountResponseBody body;

    public static ListSubAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubAccountResponse self = new ListSubAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListSubAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubAccountResponse setBody(ListSubAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubAccountResponseBody getBody() {
        return this.body;
    }

}
