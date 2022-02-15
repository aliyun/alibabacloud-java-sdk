// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GeneratePictureLinkResponse setBody(GeneratePictureLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneratePictureLinkResponseBody getBody() {
        return this.body;
    }

}
