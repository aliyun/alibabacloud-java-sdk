// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AssignUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignUsersResponseBody body;

    public static AssignUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignUsersResponse self = new AssignUsersResponse();
        return TeaModel.build(map, self);
    }

    public AssignUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignUsersResponse setBody(AssignUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignUsersResponseBody getBody() {
        return this.body;
    }

}
