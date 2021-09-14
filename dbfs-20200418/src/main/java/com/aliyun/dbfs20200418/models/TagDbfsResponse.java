// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class TagDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagDbfsResponseBody body;

    public static TagDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        TagDbfsResponse self = new TagDbfsResponse();
        return TeaModel.build(map, self);
    }

    public TagDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagDbfsResponse setBody(TagDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public TagDbfsResponseBody getBody() {
        return this.body;
    }

}
