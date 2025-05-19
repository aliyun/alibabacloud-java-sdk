// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteHybridDoubleWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHybridDoubleWriteResponseBody body;

    public static DeleteHybridDoubleWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridDoubleWriteResponse self = new DeleteHybridDoubleWriteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridDoubleWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridDoubleWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridDoubleWriteResponse setBody(DeleteHybridDoubleWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridDoubleWriteResponseBody getBody() {
        return this.body;
    }

}
