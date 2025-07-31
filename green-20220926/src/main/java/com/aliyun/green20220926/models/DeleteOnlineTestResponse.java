// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteOnlineTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOnlineTestResponseBody body;

    public static DeleteOnlineTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOnlineTestResponse self = new DeleteOnlineTestResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOnlineTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOnlineTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOnlineTestResponse setBody(DeleteOnlineTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOnlineTestResponseBody getBody() {
        return this.body;
    }

}
