// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentMonitorSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomAgentMonitorSessionsResponseBody body;

    public static ListCustomAgentMonitorSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentMonitorSessionsResponse self = new ListCustomAgentMonitorSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentMonitorSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomAgentMonitorSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomAgentMonitorSessionsResponse setBody(ListCustomAgentMonitorSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomAgentMonitorSessionsResponseBody getBody() {
        return this.body;
    }

}
