// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class VerifyRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyRouteRuleResponseBody body;

    public static VerifyRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyRouteRuleResponse self = new VerifyRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public VerifyRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyRouteRuleResponse setBody(VerifyRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyRouteRuleResponseBody getBody() {
        return this.body;
    }

}
