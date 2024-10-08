// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteUserPropertyValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserPropertyValueResponseBody body;

    public static DeleteUserPropertyValueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPropertyValueResponse self = new DeleteUserPropertyValueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserPropertyValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserPropertyValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserPropertyValueResponse setBody(DeleteUserPropertyValueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserPropertyValueResponseBody getBody() {
        return this.body;
    }

}
