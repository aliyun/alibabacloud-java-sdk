// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class LinkFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LinkFaceResponseBody body;

    public static LinkFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        LinkFaceResponse self = new LinkFaceResponse();
        return TeaModel.build(map, self);
    }

    public LinkFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LinkFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LinkFaceResponse setBody(LinkFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public LinkFaceResponseBody getBody() {
        return this.body;
    }

}
