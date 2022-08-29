// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteCsccJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCsccJobResponseBody body;

    public static DeleteCsccJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCsccJobResponse self = new DeleteCsccJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCsccJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCsccJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCsccJobResponse setBody(DeleteCsccJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCsccJobResponseBody getBody() {
        return this.body;
    }

}
