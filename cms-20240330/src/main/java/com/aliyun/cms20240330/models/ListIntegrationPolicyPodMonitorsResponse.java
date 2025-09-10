// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyPodMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyPodMonitorsResponseBody body;

    public static ListIntegrationPolicyPodMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyPodMonitorsResponse self = new ListIntegrationPolicyPodMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyPodMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyPodMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyPodMonitorsResponse setBody(ListIntegrationPolicyPodMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyPodMonitorsResponseBody getBody() {
        return this.body;
    }

}
