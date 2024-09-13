// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PrepareUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrepareUploadResponseBody body;

    public static PrepareUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepareUploadResponse self = new PrepareUploadResponse();
        return TeaModel.build(map, self);
    }

    public PrepareUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepareUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrepareUploadResponse setBody(PrepareUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepareUploadResponseBody getBody() {
        return this.body;
    }

}
