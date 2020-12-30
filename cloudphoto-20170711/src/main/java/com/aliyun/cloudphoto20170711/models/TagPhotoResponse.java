// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class TagPhotoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagPhotoResponseBody body;

    public static TagPhotoResponse build(java.util.Map<String, ?> map) throws Exception {
        TagPhotoResponse self = new TagPhotoResponse();
        return TeaModel.build(map, self);
    }

    public TagPhotoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagPhotoResponse setBody(TagPhotoResponseBody body) {
        this.body = body;
        return this;
    }
    public TagPhotoResponseBody getBody() {
        return this.body;
    }

}
