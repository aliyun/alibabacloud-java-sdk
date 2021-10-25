// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImageCategoryResponseBody body;

    public static ImageCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageCategoryResponse self = new ImageCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ImageCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageCategoryResponse setBody(ImageCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageCategoryResponseBody getBody() {
        return this.body;
    }

}
