// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LiquifyFaceResponseBody body;

    public static LiquifyFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        LiquifyFaceResponse self = new LiquifyFaceResponse();
        return TeaModel.build(map, self);
    }

    public LiquifyFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LiquifyFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LiquifyFaceResponse setBody(LiquifyFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public LiquifyFaceResponseBody getBody() {
        return this.body;
    }

}
