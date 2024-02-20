// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageBlindCharacterWatermarkResponseBody body;

    public static ImageBlindCharacterWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkResponse self = new ImageBlindCharacterWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ImageBlindCharacterWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageBlindCharacterWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageBlindCharacterWatermarkResponse setBody(ImageBlindCharacterWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageBlindCharacterWatermarkResponseBody getBody() {
        return this.body;
    }

}
