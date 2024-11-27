// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAbacPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAbacPoliciesResponseBody body;

    public static ListAbacPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAbacPoliciesResponse self = new ListAbacPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListAbacPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAbacPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAbacPoliciesResponse setBody(ListAbacPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAbacPoliciesResponseBody getBody() {
        return this.body;
    }

}
