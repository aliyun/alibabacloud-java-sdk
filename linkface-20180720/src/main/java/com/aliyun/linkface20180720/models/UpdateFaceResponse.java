// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class UpdateFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFaceResponseBody body;

    public static UpdateFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceResponse self = new UpdateFaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFaceResponse setBody(UpdateFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceResponseBody getBody() {
        return this.body;
    }

}
