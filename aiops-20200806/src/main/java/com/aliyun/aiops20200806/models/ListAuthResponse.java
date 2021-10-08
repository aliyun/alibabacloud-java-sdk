// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthResponseBody body;

    public static ListAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthResponse self = new ListAuthResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthResponse setBody(ListAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthResponseBody getBody() {
        return this.body;
    }

}
