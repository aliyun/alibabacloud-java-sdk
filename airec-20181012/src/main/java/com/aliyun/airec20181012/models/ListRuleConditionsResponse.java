// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListRuleConditionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRuleConditionsResponseBody body;

    public static ListRuleConditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleConditionsResponse self = new ListRuleConditionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleConditionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleConditionsResponse setBody(ListRuleConditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleConditionsResponseBody getBody() {
        return this.body;
    }

}
