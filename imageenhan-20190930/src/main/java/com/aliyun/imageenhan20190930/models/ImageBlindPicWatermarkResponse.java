// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageBlindPicWatermarkResponseBody body;

    public static ImageBlindPicWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkResponse self = new ImageBlindPicWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ImageBlindPicWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageBlindPicWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageBlindPicWatermarkResponse setBody(ImageBlindPicWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageBlindPicWatermarkResponseBody getBody() {
        return this.body;
    }

}
