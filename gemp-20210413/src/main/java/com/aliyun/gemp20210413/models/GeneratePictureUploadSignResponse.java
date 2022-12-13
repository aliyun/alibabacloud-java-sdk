// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureUploadSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GeneratePictureUploadSignResponseBody body;

    public static GeneratePictureUploadSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneratePictureUploadSignResponse self = new GeneratePictureUploadSignResponse();
        return TeaModel.build(map, self);
    }

    public GeneratePictureUploadSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneratePictureUploadSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeneratePictureUploadSignResponse setBody(GeneratePictureUploadSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneratePictureUploadSignResponseBody getBody() {
        return this.body;
    }

}
