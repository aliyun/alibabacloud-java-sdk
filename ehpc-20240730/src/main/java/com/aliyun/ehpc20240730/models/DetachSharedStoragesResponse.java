// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DetachSharedStoragesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachSharedStoragesResponseBody body;

    public static DetachSharedStoragesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachSharedStoragesResponse self = new DetachSharedStoragesResponse();
        return TeaModel.build(map, self);
    }

    public DetachSharedStoragesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachSharedStoragesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachSharedStoragesResponse setBody(DetachSharedStoragesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachSharedStoragesResponseBody getBody() {
        return this.body;
    }

}
