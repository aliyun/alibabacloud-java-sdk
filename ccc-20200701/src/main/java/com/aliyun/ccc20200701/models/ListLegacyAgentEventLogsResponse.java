// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAgentEventLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLegacyAgentEventLogsResponseBody body;

    public static ListLegacyAgentEventLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyAgentEventLogsResponse self = new ListLegacyAgentEventLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLegacyAgentEventLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLegacyAgentEventLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLegacyAgentEventLogsResponse setBody(ListLegacyAgentEventLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLegacyAgentEventLogsResponseBody getBody() {
        return this.body;
    }

}
