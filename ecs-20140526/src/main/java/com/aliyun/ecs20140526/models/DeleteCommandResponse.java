// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCommandResponseBody body;

    public static DeleteCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandResponse self = new DeleteCommandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCommandResponse setBody(DeleteCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommandResponseBody getBody() {
        return this.body;
    }

}
