// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetRouteRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRouteRuleResponse setBody(GetRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRouteRuleResponseBody getBody() {
        return this.body;
    }

}
