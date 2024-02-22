// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectFaceAttributesResponseBody body;

    public static DetectFaceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesResponse self = new DetectFaceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectFaceAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectFaceAttributesResponse setBody(DetectFaceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectFaceAttributesResponseBody getBody() {
        return this.body;
    }

}
