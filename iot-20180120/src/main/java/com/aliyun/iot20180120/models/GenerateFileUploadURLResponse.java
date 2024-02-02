// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateFileUploadURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateFileUploadURLResponseBody body;

    public static GenerateFileUploadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadURLResponse self = new GenerateFileUploadURLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateFileUploadURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateFileUploadURLResponse setBody(GenerateFileUploadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateFileUploadURLResponseBody getBody() {
        return this.body;
    }

}
