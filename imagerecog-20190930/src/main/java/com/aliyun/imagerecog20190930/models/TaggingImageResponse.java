// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TaggingImageResponseBody body;

    public static TaggingImageResponse build(java.util.Map<String, ?> map) throws Exception {
        TaggingImageResponse self = new TaggingImageResponse();
        return TeaModel.build(map, self);
    }

    public TaggingImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaggingImageResponse setBody(TaggingImageResponseBody body) {
        this.body = body;
        return this;
    }
    public TaggingImageResponseBody getBody() {
        return this.body;
    }

}
