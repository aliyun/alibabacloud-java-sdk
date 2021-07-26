// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConnectionPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectionPoliciesResponseBody body;

    public static ListConnectionPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoliciesResponse self = new ListConnectionPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectionPoliciesResponse setBody(ListConnectionPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectionPoliciesResponseBody getBody() {
        return this.body;
    }

}
