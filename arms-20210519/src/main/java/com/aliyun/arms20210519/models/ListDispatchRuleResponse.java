// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDispatchRuleResponseBody body;

    public static ListDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDispatchRuleResponse self = new ListDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDispatchRuleResponse setBody(ListDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
