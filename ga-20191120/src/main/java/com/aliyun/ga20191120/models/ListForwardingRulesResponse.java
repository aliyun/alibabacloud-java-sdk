// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListForwardingRulesResponseBody body;

    public static ListForwardingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListForwardingRulesResponse self = new ListForwardingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListForwardingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListForwardingRulesResponse setBody(ListForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
