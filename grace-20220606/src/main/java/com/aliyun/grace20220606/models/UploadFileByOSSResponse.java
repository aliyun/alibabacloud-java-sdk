// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class UploadFileByOSSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFileByOSSResponseBody body;

    public static UploadFileByOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileByOSSResponse self = new UploadFileByOSSResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileByOSSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFileByOSSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadFileByOSSResponse setBody(UploadFileByOSSResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFileByOSSResponseBody getBody() {
        return this.body;
    }

}
