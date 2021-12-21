// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTrafficMarkingPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrafficMarkingPoliciesResponseBody body;

    public static ListTrafficMarkingPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMarkingPoliciesResponse self = new ListTrafficMarkingPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficMarkingPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficMarkingPoliciesResponse setBody(ListTrafficMarkingPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficMarkingPoliciesResponseBody getBody() {
        return this.body;
    }

}
