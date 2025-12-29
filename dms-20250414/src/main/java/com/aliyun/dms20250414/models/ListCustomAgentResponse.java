// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomAgentResponseBody body;

    public static ListCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentResponse self = new ListCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomAgentResponse setBody(ListCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomAgentResponseBody getBody() {
        return this.body;
    }

}
