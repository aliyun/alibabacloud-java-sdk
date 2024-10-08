// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteRulesResponseBody body;

    public static ListRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesResponse self = new ListRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteRulesResponse setBody(ListRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteRulesResponseBody getBody() {
        return this.body;
    }

}
