// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class TagCustomPersonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TagCustomPersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagCustomPersonResponse setBody(TagCustomPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public TagCustomPersonResponseBody getBody() {
        return this.body;
    }

}
