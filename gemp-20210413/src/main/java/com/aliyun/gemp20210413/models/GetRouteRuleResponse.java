// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRouteRuleResponseBody body;

    public static GetRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRouteRuleResponse self = new GetRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRouteRuleResponse setBody(GetRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRouteRuleResponseBody getBody() {
        return this.body;
    }

}
