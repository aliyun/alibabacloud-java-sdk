// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UploadImageToLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadImageToLibResponseBody body;

    public static UploadImageToLibResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadImageToLibResponse self = new UploadImageToLibResponse();
        return TeaModel.build(map, self);
    }

    public UploadImageToLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadImageToLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadImageToLibResponse setBody(UploadImageToLibResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadImageToLibResponseBody getBody() {
        return this.body;
    }

}
