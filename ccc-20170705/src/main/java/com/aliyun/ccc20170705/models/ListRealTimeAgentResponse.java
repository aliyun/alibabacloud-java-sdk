// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRealTimeAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRealTimeAgentResponseBody body;

    public static ListRealTimeAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealTimeAgentResponse self = new ListRealTimeAgentResponse();
        return TeaModel.build(map, self);
    }

    public ListRealTimeAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealTimeAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRealTimeAgentResponse setBody(ListRealTimeAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealTimeAgentResponseBody getBody() {
        return this.body;
    }

}
