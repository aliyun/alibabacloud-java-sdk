// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteProgramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProgramResponseBody body;

    public static DeleteProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProgramResponse self = new DeleteProgramResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProgramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProgramResponse setBody(DeleteProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProgramResponseBody getBody() {
        return this.body;
    }

}
