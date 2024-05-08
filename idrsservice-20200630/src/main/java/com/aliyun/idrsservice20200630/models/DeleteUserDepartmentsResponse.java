// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteUserDepartmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserDepartmentsResponseBody body;

    public static DeleteUserDepartmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDepartmentsResponse self = new DeleteUserDepartmentsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserDepartmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserDepartmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserDepartmentsResponse setBody(DeleteUserDepartmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserDepartmentsResponseBody getBody() {
        return this.body;
    }

}
