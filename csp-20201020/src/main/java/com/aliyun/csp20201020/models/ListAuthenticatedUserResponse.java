// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListAuthenticatedUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthenticatedUserResponseBody body;

    public static ListAuthenticatedUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatedUserResponse self = new ListAuthenticatedUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatedUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthenticatedUserResponse setBody(ListAuthenticatedUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthenticatedUserResponseBody getBody() {
        return this.body;
    }

}
