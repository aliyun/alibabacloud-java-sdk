// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class TagCustomPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagCustomPersonResponseBody body;

    public static TagCustomPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        TagCustomPersonResponse self = new TagCustomPersonResponse();
        return TeaModel.build(map, self);
    }

    public TagCustomPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagCustomPersonResponse setBody(TagCustomPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public TagCustomPersonResponseBody getBody() {
        return this.body;
    }

}
