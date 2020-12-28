// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListSystemRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSystemRulesResponseBody body;

    public static ListSystemRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemRulesResponse self = new ListSystemRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemRulesResponse setBody(ListSystemRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemRulesResponseBody getBody() {
        return this.body;
    }

}
