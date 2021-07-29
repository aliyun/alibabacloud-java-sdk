// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageDuplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImageDuplicationResponseBody body;

    public static ImageDuplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageDuplicationResponse self = new ImageDuplicationResponse();
        return TeaModel.build(map, self);
    }

    public ImageDuplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageDuplicationResponse setBody(ImageDuplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageDuplicationResponseBody getBody() {
        return this.body;
    }

}
