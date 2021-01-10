// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class ImagePredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImagePredictResponseBody body;

    public static ImagePredictResponse build(java.util.Map<String, ?> map) throws Exception {
        ImagePredictResponse self = new ImagePredictResponse();
        return TeaModel.build(map, self);
    }

    public ImagePredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImagePredictResponse setBody(ImagePredictResponseBody body) {
        this.body = body;
        return this;
    }
    public ImagePredictResponseBody getBody() {
        return this.body;
    }

}
