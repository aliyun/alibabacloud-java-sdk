// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyStorageRequirementsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyStorageRequirementsResponseBody body;

    public static ListIntegrationPolicyStorageRequirementsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyStorageRequirementsResponse self = new ListIntegrationPolicyStorageRequirementsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyStorageRequirementsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyStorageRequirementsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyStorageRequirementsResponse setBody(ListIntegrationPolicyStorageRequirementsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyStorageRequirementsResponseBody getBody() {
        return this.body;
    }

}
