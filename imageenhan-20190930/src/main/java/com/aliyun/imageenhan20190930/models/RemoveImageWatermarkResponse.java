// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveImageWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveImageWatermarkResponse setBody(RemoveImageWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageWatermarkResponseBody getBody() {
        return this.body;
    }

}
