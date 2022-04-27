// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizationRulesResponseBody body;

    public static ListAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesResponse self = new ListAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationRulesResponse setBody(ListAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
