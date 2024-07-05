// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnregisterCustomFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnregisterCustomFaceResponseBody body;

    public static UnregisterCustomFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCustomFaceResponse self = new UnregisterCustomFaceResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterCustomFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterCustomFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnregisterCustomFaceResponse setBody(UnregisterCustomFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterCustomFaceResponseBody getBody() {
        return this.body;
    }

}
