// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class AddAclAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAclAuthorizationResponseBody body;

    public static AddAclAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAclAuthorizationResponse self = new AddAclAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public AddAclAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAclAuthorizationResponse setBody(AddAclAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAclAuthorizationResponseBody getBody() {
        return this.body;
    }

}
