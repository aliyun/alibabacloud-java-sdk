// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsrTaskResponseBody body;

    public static AsrTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AsrTaskResponse self = new AsrTaskResponse();
        return TeaModel.build(map, self);
    }

    public AsrTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsrTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsrTaskResponse setBody(AsrTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AsrTaskResponseBody getBody() {
        return this.body;
    }

}
