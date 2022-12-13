// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureUploadSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateProblemPictureUploadSignResponseBody body;

    public static GenerateProblemPictureUploadSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureUploadSignResponse self = new GenerateProblemPictureUploadSignResponse();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureUploadSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateProblemPictureUploadSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateProblemPictureUploadSignResponse setBody(GenerateProblemPictureUploadSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateProblemPictureUploadSignResponseBody getBody() {
        return this.body;
    }

}
