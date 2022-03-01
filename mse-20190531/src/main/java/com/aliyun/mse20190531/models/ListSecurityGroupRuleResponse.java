// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSecurityGroupRuleResponseBody body;

    public static ListSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupRuleResponse self = new ListSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityGroupRuleResponse setBody(ListSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
