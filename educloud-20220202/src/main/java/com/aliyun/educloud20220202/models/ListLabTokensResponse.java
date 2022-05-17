// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabTokensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLabTokensResponseBody body;

    public static ListLabTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLabTokensResponse self = new ListLabTokensResponse();
        return TeaModel.build(map, self);
    }

    public ListLabTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLabTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLabTokensResponse setBody(ListLabTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLabTokensResponseBody getBody() {
        return this.body;
    }

}
