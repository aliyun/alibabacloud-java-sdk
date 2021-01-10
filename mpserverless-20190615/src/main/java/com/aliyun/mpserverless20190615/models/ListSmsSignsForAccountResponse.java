// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSmsSignsForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmsSignsForAccountResponseBody body;

    public static ListSmsSignsForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmsSignsForAccountResponse self = new ListSmsSignsForAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListSmsSignsForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmsSignsForAccountResponse setBody(ListSmsSignsForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmsSignsForAccountResponseBody getBody() {
        return this.body;
    }

}
