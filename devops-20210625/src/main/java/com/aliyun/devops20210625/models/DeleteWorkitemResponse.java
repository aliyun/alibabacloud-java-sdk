// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkitemResponseBody body;

    public static DeleteWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemResponse self = new DeleteWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkitemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkitemResponse setBody(DeleteWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkitemResponseBody getBody() {
        return this.body;
    }

}
