// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PublishGalleryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishGalleryResponseBody body;

    public static PublishGalleryResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishGalleryResponse self = new PublishGalleryResponse();
        return TeaModel.build(map, self);
    }

    public PublishGalleryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishGalleryResponse setBody(PublishGalleryResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishGalleryResponseBody getBody() {
        return this.body;
    }

}
