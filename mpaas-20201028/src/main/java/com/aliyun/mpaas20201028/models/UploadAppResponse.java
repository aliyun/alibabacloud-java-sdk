// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadAppResponseBody body;

    public static UploadAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAppResponse self = new UploadAppResponse();
        return TeaModel.build(map, self);
    }

    public UploadAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAppResponse setBody(UploadAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAppResponseBody getBody() {
        return this.body;
    }

}
