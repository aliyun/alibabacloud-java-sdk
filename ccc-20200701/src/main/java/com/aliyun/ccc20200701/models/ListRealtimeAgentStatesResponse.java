// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeAgentStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRealtimeAgentStatesResponseBody body;

    public static ListRealtimeAgentStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeAgentStatesResponse self = new ListRealtimeAgentStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeAgentStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeAgentStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRealtimeAgentStatesResponse setBody(ListRealtimeAgentStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeAgentStatesResponseBody getBody() {
        return this.body;
    }

}
