// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForNetworkZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConditionalAccessPoliciesForNetworkZoneResponseBody body;

    public static ListConditionalAccessPoliciesForNetworkZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForNetworkZoneResponse self = new ListConditionalAccessPoliciesForNetworkZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForNetworkZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConditionalAccessPoliciesForNetworkZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConditionalAccessPoliciesForNetworkZoneResponse setBody(ListConditionalAccessPoliciesForNetworkZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConditionalAccessPoliciesForNetworkZoneResponseBody getBody() {
        return this.body;
    }

}
