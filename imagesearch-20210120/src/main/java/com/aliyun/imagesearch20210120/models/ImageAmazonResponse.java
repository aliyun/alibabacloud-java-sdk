// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageAmazonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImageAmazonResponseBody body;

    public static ImageAmazonResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAmazonResponse self = new ImageAmazonResponse();
        return TeaModel.build(map, self);
    }

    public ImageAmazonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageAmazonResponse setBody(ImageAmazonResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageAmazonResponseBody getBody() {
        return this.body;
    }

}
