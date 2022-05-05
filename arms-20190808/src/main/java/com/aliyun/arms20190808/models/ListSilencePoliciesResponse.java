// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSilencePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSilencePoliciesResponseBody body;

    public static ListSilencePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSilencePoliciesResponse self = new ListSilencePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListSilencePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSilencePoliciesResponse setBody(ListSilencePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSilencePoliciesResponseBody getBody() {
        return this.body;
    }

}
