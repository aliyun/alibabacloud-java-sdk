// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyServiceMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyServiceMonitorsResponseBody body;

    public static ListIntegrationPolicyServiceMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyServiceMonitorsResponse self = new ListIntegrationPolicyServiceMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyServiceMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyServiceMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyServiceMonitorsResponse setBody(ListIntegrationPolicyServiceMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyServiceMonitorsResponseBody getBody() {
        return this.body;
    }

}
