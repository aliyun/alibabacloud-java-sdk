// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GeneratePictureLinkResponseBody body;

    public static GeneratePictureLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneratePictureLinkResponse self = new GeneratePictureLinkResponse();
        return TeaModel.build(map, self);
    }

    public GeneratePictureLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneratePictureLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeneratePictureLinkResponse setBody(GeneratePictureLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneratePictureLinkResponseBody getBody() {
        return this.body;
    }

}
