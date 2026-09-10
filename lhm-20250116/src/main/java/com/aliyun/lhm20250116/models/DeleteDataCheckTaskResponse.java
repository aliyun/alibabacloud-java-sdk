// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class DeleteDataCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataCheckTaskResponseBody body;

    public static DeleteDataCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCheckTaskResponse self = new DeleteDataCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataCheckTaskResponse setBody(DeleteDataCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataCheckTaskResponseBody getBody() {
        return this.body;
    }

}
