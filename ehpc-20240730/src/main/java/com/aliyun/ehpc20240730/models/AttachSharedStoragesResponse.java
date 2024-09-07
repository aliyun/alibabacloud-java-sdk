// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AttachSharedStoragesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachSharedStoragesResponseBody body;

    public static AttachSharedStoragesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachSharedStoragesResponse self = new AttachSharedStoragesResponse();
        return TeaModel.build(map, self);
    }

    public AttachSharedStoragesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachSharedStoragesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachSharedStoragesResponse setBody(AttachSharedStoragesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachSharedStoragesResponseBody getBody() {
        return this.body;
    }

}
