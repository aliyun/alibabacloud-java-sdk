// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryCodeResponseBody body;

    public static ListRepositoryCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCodeResponse self = new ListRepositoryCodeResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryCodeResponse setBody(ListRepositoryCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryCodeResponseBody getBody() {
        return this.body;
    }

}
