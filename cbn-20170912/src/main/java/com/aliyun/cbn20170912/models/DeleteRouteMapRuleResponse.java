// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteMapRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteMapRuleResponseBody body;

    public static DeleteRouteMapRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteMapRuleResponse self = new DeleteRouteMapRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteMapRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteMapRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteMapRuleResponse setBody(DeleteRouteMapRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteMapRuleResponseBody getBody() {
        return this.body;
    }

}
