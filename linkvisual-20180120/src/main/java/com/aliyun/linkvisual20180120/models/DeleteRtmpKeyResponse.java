// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRtmpKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRtmpKeyResponseBody body;

    public static DeleteRtmpKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtmpKeyResponse self = new DeleteRtmpKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRtmpKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRtmpKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRtmpKeyResponse setBody(DeleteRtmpKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRtmpKeyResponseBody getBody() {
        return this.body;
    }

}
