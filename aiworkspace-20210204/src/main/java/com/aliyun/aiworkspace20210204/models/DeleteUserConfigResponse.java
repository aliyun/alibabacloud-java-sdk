// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserConfigResponseBody body;

    public static DeleteUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserConfigResponse self = new DeleteUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserConfigResponse setBody(DeleteUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserConfigResponseBody getBody() {
        return this.body;
    }

}
