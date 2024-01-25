// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceLogResponseBody body;

    public static DeleteResourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceLogResponse self = new DeleteResourceLogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceLogResponse setBody(DeleteResourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceLogResponseBody getBody() {
        return this.body;
    }

}
