// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ExtractWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractWatermarkResponseBody body;

    public static ExtractWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractWatermarkResponse self = new ExtractWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ExtractWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractWatermarkResponse setBody(ExtractWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractWatermarkResponseBody getBody() {
        return this.body;
    }

}
