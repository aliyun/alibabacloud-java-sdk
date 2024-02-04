// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileMetaResponseBody body;

    public static GetFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileMetaResponse self = new GetFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileMetaResponse setBody(GetFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileMetaResponseBody getBody() {
        return this.body;
    }

}
