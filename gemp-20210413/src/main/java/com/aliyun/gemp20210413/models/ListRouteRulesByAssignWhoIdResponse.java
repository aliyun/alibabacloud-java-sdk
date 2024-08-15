// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesByAssignWhoIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteRulesByAssignWhoIdResponseBody body;

    public static ListRouteRulesByAssignWhoIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesByAssignWhoIdResponse self = new ListRouteRulesByAssignWhoIdResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesByAssignWhoIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteRulesByAssignWhoIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteRulesByAssignWhoIdResponse setBody(ListRouteRulesByAssignWhoIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteRulesByAssignWhoIdResponseBody getBody() {
        return this.body;
    }

}
