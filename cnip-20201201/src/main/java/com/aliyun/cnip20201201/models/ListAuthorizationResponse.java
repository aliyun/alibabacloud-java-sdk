// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizationResponseBody body;

    public static ListAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationResponse self = new ListAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationResponse setBody(ListAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationResponseBody getBody() {
        return this.body;
    }

}
