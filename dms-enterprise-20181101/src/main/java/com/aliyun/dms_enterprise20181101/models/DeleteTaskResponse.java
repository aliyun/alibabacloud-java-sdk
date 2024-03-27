// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTaskResponseBody body;

    public static DeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskResponse self = new DeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTaskResponse setBody(DeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskResponseBody getBody() {
        return this.body;
    }

}
