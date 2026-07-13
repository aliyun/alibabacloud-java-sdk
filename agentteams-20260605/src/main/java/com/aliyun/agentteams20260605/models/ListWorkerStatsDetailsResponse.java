// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkerStatsDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkerStatsDetailsResponseBody body;

    public static ListWorkerStatsDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerStatsDetailsResponse self = new ListWorkerStatsDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkerStatsDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkerStatsDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkerStatsDetailsResponse setBody(ListWorkerStatsDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkerStatsDetailsResponseBody getBody() {
        return this.body;
    }

}
