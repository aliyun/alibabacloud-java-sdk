// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceMirrorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceMirrorResponseBody body;

    public static DeleteServiceMirrorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMirrorResponse self = new DeleteServiceMirrorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceMirrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceMirrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceMirrorResponse setBody(DeleteServiceMirrorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceMirrorResponseBody getBody() {
        return this.body;
    }

}
