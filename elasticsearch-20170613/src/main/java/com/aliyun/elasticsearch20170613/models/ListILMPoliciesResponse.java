// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListILMPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListILMPoliciesResponseBody body;

    public static ListILMPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListILMPoliciesResponse self = new ListILMPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListILMPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListILMPoliciesResponse setBody(ListILMPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListILMPoliciesResponseBody getBody() {
        return this.body;
    }

}
