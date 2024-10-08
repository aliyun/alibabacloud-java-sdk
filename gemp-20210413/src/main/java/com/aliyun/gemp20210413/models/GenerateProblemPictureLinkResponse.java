// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateProblemPictureLinkResponseBody body;

    public static GenerateProblemPictureLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureLinkResponse self = new GenerateProblemPictureLinkResponse();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateProblemPictureLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateProblemPictureLinkResponse setBody(GenerateProblemPictureLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateProblemPictureLinkResponseBody getBody() {
        return this.body;
    }

}
