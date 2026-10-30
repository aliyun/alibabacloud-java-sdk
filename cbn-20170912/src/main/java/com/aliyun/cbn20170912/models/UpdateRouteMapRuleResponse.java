// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateRouteMapRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRouteMapRuleResponseBody body;

    public static UpdateRouteMapRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteMapRuleResponse self = new UpdateRouteMapRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRouteMapRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRouteMapRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRouteMapRuleResponse setBody(UpdateRouteMapRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRouteMapRuleResponseBody getBody() {
        return this.body;
    }

}
