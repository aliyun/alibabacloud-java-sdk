// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteRuleResponseBody body;

    public static ListRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRuleResponse self = new ListRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteRuleResponse setBody(ListRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteRuleResponseBody getBody() {
        return this.body;
    }

}
