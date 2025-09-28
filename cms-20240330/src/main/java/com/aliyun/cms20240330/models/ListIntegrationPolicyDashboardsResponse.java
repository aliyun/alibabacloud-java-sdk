// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyDashboardsResponseBody body;

    public static ListIntegrationPolicyDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyDashboardsResponse self = new ListIntegrationPolicyDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyDashboardsResponse setBody(ListIntegrationPolicyDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyDashboardsResponseBody getBody() {
        return this.body;
    }

}
