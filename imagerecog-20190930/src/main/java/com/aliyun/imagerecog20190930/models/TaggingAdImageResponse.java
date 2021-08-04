// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingAdImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TaggingAdImageResponseBody body;

    public static TaggingAdImageResponse build(java.util.Map<String, ?> map) throws Exception {
        TaggingAdImageResponse self = new TaggingAdImageResponse();
        return TeaModel.build(map, self);
    }

    public TaggingAdImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaggingAdImageResponse setBody(TaggingAdImageResponseBody body) {
        this.body = body;
        return this;
    }
    public TaggingAdImageResponseBody getBody() {
        return this.body;
    }

}
