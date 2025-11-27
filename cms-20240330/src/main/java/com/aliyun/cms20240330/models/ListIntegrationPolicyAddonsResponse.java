// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyAddonsResponseBody body;

    public static ListIntegrationPolicyAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyAddonsResponse self = new ListIntegrationPolicyAddonsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyAddonsResponse setBody(ListIntegrationPolicyAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyAddonsResponseBody getBody() {
        return this.body;
    }

}
