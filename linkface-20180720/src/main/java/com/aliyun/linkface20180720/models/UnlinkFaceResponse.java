// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class UnlinkFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlinkFaceResponseBody body;

    public static UnlinkFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlinkFaceResponse self = new UnlinkFaceResponse();
        return TeaModel.build(map, self);
    }

    public UnlinkFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlinkFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlinkFaceResponse setBody(UnlinkFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlinkFaceResponseBody getBody() {
        return this.body;
    }

}
