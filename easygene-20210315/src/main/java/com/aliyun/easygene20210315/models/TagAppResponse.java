// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class TagAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagAppResponseBody body;

    public static TagAppResponse build(java.util.Map<String, ?> map) throws Exception {
        TagAppResponse self = new TagAppResponse();
        return TeaModel.build(map, self);
    }

    public TagAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagAppResponse setBody(TagAppResponseBody body) {
        this.body = body;
        return this;
    }
    public TagAppResponseBody getBody() {
        return this.body;
    }

}
