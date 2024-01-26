// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRAMDirectoryResponseBody body;

    public static CreateRAMDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRAMDirectoryResponse self = new CreateRAMDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRAMDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRAMDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRAMDirectoryResponse setBody(CreateRAMDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRAMDirectoryResponseBody getBody() {
        return this.body;
    }

}
