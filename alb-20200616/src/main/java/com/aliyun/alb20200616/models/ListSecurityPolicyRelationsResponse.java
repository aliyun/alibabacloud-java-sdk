// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSecurityPolicyRelationsResponseBody body;

    public static ListSecurityPolicyRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyRelationsResponse self = new ListSecurityPolicyRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityPolicyRelationsResponse setBody(ListSecurityPolicyRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityPolicyRelationsResponseBody getBody() {
        return this.body;
    }

}
