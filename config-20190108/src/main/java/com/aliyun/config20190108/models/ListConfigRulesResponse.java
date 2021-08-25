// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigRulesResponseBody body;

    public static ListConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesResponse self = new ListConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigRulesResponse setBody(ListConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigRulesResponseBody getBody() {
        return this.body;
    }

}
