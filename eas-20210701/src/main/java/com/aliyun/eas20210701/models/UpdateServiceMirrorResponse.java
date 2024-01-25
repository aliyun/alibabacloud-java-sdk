// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceMirrorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceMirrorResponseBody body;

    public static UpdateServiceMirrorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceMirrorResponse self = new UpdateServiceMirrorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceMirrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceMirrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceMirrorResponse setBody(UpdateServiceMirrorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceMirrorResponseBody getBody() {
        return this.body;
    }

}
