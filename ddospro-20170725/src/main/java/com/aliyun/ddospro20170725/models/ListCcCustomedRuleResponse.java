// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ListCcCustomedRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCcCustomedRuleResponseBody body;

    public static ListCcCustomedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCcCustomedRuleResponse self = new ListCcCustomedRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListCcCustomedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCcCustomedRuleResponse setBody(ListCcCustomedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCcCustomedRuleResponseBody getBody() {
        return this.body;
    }

}
