// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListAclAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAclAuthorizationResponseBody body;

    public static ListAclAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclAuthorizationResponse self = new ListAclAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListAclAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclAuthorizationResponse setBody(ListAclAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclAuthorizationResponseBody getBody() {
        return this.body;
    }

}
