// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceGroupUserResponseBody body;

    public static DeleteServiceGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupUserResponse self = new DeleteServiceGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceGroupUserResponse setBody(DeleteServiceGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceGroupUserResponseBody getBody() {
        return this.body;
    }

}
