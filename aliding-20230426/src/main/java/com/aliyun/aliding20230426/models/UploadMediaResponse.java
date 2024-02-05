// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UploadMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadMediaResponseBody body;

    public static UploadMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaResponse self = new UploadMediaResponse();
        return TeaModel.build(map, self);
    }

    public UploadMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMediaResponse setBody(UploadMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMediaResponseBody getBody() {
        return this.body;
    }

}
