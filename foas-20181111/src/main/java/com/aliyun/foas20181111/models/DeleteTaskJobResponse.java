// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteTaskJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTaskJobResponseBody body;

    public static DeleteTaskJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskJobResponse self = new DeleteTaskJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTaskJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTaskJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTaskJobResponse setBody(DeleteTaskJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskJobResponseBody getBody() {
        return this.body;
    }

}
