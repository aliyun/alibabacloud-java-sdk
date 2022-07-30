// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RpcDataUploadResponseBody body;

    public static RpcDataUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadResponse self = new RpcDataUploadResponse();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcDataUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RpcDataUploadResponse setBody(RpcDataUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcDataUploadResponseBody getBody() {
        return this.body;
    }

}
