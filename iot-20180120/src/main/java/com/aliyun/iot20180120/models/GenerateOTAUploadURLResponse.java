// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateOTAUploadURLResponse setBody(GenerateOTAUploadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOTAUploadURLResponseBody getBody() {
        return this.body;
    }

}
