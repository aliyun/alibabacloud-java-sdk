// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPoliciesResponseBody body;

    public static ListIntegrationPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPoliciesResponse self = new ListIntegrationPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPoliciesResponse setBody(ListIntegrationPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPoliciesResponseBody getBody() {
        return this.body;
    }

}
