// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesByServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteRulesByServiceResponseBody body;

    public static ListRouteRulesByServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesByServiceResponse self = new ListRouteRulesByServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesByServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteRulesByServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteRulesByServiceResponse setBody(ListRouteRulesByServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteRulesByServiceResponseBody getBody() {
        return this.body;
    }

}
