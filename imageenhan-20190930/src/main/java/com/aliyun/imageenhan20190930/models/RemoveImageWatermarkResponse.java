// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveImageWatermarkResponseBody body;

    public static RemoveImageWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageWatermarkResponse self = new RemoveImageWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public RemoveImageWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveImageWatermarkResponse setBody(RemoveImageWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageWatermarkResponseBody getBody() {
        return this.body;
    }

}
