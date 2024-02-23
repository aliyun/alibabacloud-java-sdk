// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteAScriptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAScriptsResponseBody body;

    public static DeleteAScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAScriptsResponse self = new DeleteAScriptsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAScriptsResponse setBody(DeleteAScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAScriptsResponseBody getBody() {
        return this.body;
    }

}
