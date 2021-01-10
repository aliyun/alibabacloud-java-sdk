// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveDetectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLiveDetectionResponseBody body;

    public static CreateLiveDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveDetectionResponse self = new CreateLiveDetectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveDetectionResponse setBody(CreateLiveDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveDetectionResponseBody getBody() {
        return this.body;
    }

}
