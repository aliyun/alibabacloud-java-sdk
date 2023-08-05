// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class UploadStaticFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadStaticFileResponseBody body;

    public static UploadStaticFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadStaticFileResponse self = new UploadStaticFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadStaticFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadStaticFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadStaticFileResponse setBody(UploadStaticFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadStaticFileResponseBody getBody() {
        return this.body;
    }

}
