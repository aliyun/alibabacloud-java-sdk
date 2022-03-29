// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class UploadWatermarkLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadWatermarkLogResponseBody body;

    public static UploadWatermarkLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadWatermarkLogResponse self = new UploadWatermarkLogResponse();
        return TeaModel.build(map, self);
    }

    public UploadWatermarkLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadWatermarkLogResponse setBody(UploadWatermarkLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadWatermarkLogResponseBody getBody() {
        return this.body;
    }

}
