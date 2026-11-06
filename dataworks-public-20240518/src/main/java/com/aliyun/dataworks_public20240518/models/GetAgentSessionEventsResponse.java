// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSessionEventsResponseBody body;

    public static GetAgentSessionEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionEventsResponse self = new GetAgentSessionEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSessionEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSessionEventsResponse setBody(GetAgentSessionEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSessionEventsResponseBody getBody() {
        return this.body;
    }

}
