// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteMapRuleResponseBody body;

    public static CreateRouteMapRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapRuleResponse self = new CreateRouteMapRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteMapRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteMapRuleResponse setBody(CreateRouteMapRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteMapRuleResponseBody getBody() {
        return this.body;
    }

}
