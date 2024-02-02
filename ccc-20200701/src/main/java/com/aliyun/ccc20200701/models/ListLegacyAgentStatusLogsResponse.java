// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAgentStatusLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLegacyAgentStatusLogsResponseBody body;

    public static ListLegacyAgentStatusLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyAgentStatusLogsResponse self = new ListLegacyAgentStatusLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLegacyAgentStatusLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLegacyAgentStatusLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLegacyAgentStatusLogsResponse setBody(ListLegacyAgentStatusLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLegacyAgentStatusLogsResponseBody getBody() {
        return this.body;
    }

}
