// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateOTAUploadURLResponseBody body;

    public static GenerateOTAUploadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLResponse self = new GenerateOTAUploadURLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOTAUploadURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateOTAUploadURLResponse setBody(GenerateOTAUploadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOTAUploadURLResponseBody getBody() {
        return this.body;
    }

}
