// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class TagResourcesNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagResourcesNewResponseBody body;

    public static TagResourcesNewResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesNewResponse self = new TagResourcesNewResponse();
        return TeaModel.build(map, self);
    }

    public TagResourcesNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourcesNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagResourcesNewResponse setBody(TagResourcesNewResponseBody body) {
        this.body = body;
        return this;
    }
    public TagResourcesNewResponseBody getBody() {
        return this.body;
    }

}
