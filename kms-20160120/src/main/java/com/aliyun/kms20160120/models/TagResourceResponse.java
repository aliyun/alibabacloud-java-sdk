// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagResourceResponseBody body;

    public static TagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourceResponse self = new TagResourceResponse();
        return TeaModel.build(map, self);
    }

    public TagResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagResourceResponse setBody(TagResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public TagResourceResponseBody getBody() {
        return this.body;
    }

}
