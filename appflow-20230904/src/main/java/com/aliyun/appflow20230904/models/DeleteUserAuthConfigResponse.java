// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DeleteUserAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserAuthConfigResponseBody body;

    public static DeleteUserAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAuthConfigResponse self = new DeleteUserAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserAuthConfigResponse setBody(DeleteUserAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserAuthConfigResponseBody getBody() {
        return this.body;
    }

}
