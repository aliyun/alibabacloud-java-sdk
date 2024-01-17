// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTeamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTeamsResponseBody body;

    public static ListTeamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsResponse self = new ListTeamsResponse();
        return TeaModel.build(map, self);
    }

    public ListTeamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTeamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTeamsResponse setBody(ListTeamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTeamsResponseBody getBody() {
        return this.body;
    }

}
