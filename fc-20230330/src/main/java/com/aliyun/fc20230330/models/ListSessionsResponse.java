// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSessionsOutput body;

    public static ListSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsResponse self = new ListSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSessionsResponse setBody(ListSessionsOutput body) {
        this.body = body;
        return this;
    }
    public ListSessionsOutput getBody() {
        return this.body;
    }

}
