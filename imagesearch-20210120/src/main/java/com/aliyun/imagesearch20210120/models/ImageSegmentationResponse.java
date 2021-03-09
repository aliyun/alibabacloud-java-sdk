// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageSegmentationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImageSegmentationResponseBody body;

    public static ImageSegmentationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageSegmentationResponse self = new ImageSegmentationResponse();
        return TeaModel.build(map, self);
    }

    public ImageSegmentationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageSegmentationResponse setBody(ImageSegmentationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageSegmentationResponseBody getBody() {
        return this.body;
    }

}
