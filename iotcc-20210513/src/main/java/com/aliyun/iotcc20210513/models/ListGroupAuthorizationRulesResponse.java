// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListGroupAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupAuthorizationRulesResponseBody body;

    public static ListGroupAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAuthorizationRulesResponse self = new ListGroupAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupAuthorizationRulesResponse setBody(ListGroupAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
