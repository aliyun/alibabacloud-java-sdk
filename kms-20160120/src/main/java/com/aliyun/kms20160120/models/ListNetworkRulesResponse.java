// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListNetworkRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetworkRulesResponseBody body;

    public static ListNetworkRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkRulesResponse self = new ListNetworkRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkRulesResponse setBody(ListNetworkRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkRulesResponseBody getBody() {
        return this.body;
    }

}
