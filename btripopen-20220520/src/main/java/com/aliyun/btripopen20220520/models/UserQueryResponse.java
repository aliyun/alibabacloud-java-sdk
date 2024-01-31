// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UserQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UserQueryResponseBody body;

    public static UserQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        UserQueryResponse self = new UserQueryResponse();
        return TeaModel.build(map, self);
    }

    public UserQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserQueryResponse setBody(UserQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public UserQueryResponseBody getBody() {
        return this.body;
    }

}
