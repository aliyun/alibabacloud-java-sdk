// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentEventsResponseBody body;

    public static ListAgentEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentEventsResponse self = new ListAgentEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentEventsResponse setBody(ListAgentEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentEventsResponseBody getBody() {
        return this.body;
    }

}
