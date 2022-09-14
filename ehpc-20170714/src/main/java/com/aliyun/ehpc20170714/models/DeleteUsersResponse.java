// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class DeleteUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUsersResponseBody body;

    public static DeleteUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersResponse self = new DeleteUsersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUsersResponse setBody(DeleteUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUsersResponseBody getBody() {
        return this.body;
    }

}
