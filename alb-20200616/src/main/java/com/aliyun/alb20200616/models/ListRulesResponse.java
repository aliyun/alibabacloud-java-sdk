// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRulesResponseBody body;

    public static ListRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponse self = new ListRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRulesResponse setBody(ListRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRulesResponseBody getBody() {
        return this.body;
    }

}
