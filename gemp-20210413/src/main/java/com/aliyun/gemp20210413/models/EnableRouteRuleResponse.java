// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableRouteRuleResponseBody body;

    public static EnableRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRouteRuleResponse self = new EnableRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRouteRuleResponse setBody(EnableRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRouteRuleResponseBody getBody() {
        return this.body;
    }

}
