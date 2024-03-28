// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListForwardingRulesResponseBody body;

    public static ListForwardingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListForwardingRulesResponse self = new ListForwardingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListForwardingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListForwardingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListForwardingRulesResponse setBody(ListForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
