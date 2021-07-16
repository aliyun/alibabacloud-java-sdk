// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableRouteRuleResponseBody body;

    public static DisableRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableRouteRuleResponse self = new DisableRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableRouteRuleResponse setBody(DisableRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableRouteRuleResponseBody getBody() {
        return this.body;
    }

}
