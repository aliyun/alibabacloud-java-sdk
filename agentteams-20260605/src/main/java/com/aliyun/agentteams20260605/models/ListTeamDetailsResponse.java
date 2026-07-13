// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListTeamDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTeamDetailsResponseBody body;

    public static ListTeamDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTeamDetailsResponse self = new ListTeamDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListTeamDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTeamDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTeamDetailsResponse setBody(ListTeamDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTeamDetailsResponseBody getBody() {
        return this.body;
    }

}
