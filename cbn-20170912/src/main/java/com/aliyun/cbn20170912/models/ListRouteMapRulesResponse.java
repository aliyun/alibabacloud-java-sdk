// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListRouteMapRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteMapRulesResponseBody body;

    public static ListRouteMapRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapRulesResponse self = new ListRouteMapRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteMapRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteMapRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteMapRulesResponse setBody(ListRouteMapRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteMapRulesResponseBody getBody() {
        return this.body;
    }

}
