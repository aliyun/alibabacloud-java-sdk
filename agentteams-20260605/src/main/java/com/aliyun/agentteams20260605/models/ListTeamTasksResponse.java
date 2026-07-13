// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListTeamTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTeamTasksResponseBody body;

    public static ListTeamTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTeamTasksResponse self = new ListTeamTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTeamTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTeamTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTeamTasksResponse setBody(ListTeamTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTeamTasksResponseBody getBody() {
        return this.body;
    }

}
