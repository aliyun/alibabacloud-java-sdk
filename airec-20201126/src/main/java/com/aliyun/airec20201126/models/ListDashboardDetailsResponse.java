// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDashboardDetailsResponseBody body;

    public static ListDashboardDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsResponse self = new ListDashboardDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardDetailsResponse setBody(ListDashboardDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardDetailsResponseBody getBody() {
        return this.body;
    }

}
