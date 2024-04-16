// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentOverviewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentOverviewsResponseBody body;

    public static ListEnvironmentOverviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentOverviewsResponse self = new ListEnvironmentOverviewsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentOverviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentOverviewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentOverviewsResponse setBody(ListEnvironmentOverviewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentOverviewsResponseBody getBody() {
        return this.body;
    }

}
