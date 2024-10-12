// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteRunLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRunLabelResponseBody body;

    public static DeleteRunLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRunLabelResponse self = new DeleteRunLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRunLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRunLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRunLabelResponse setBody(DeleteRunLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRunLabelResponseBody getBody() {
        return this.body;
    }

}
