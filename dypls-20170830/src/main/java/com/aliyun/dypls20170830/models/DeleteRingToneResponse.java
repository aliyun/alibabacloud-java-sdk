// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class DeleteRingToneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRingToneResponseBody body;

    public static DeleteRingToneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRingToneResponse self = new DeleteRingToneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRingToneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRingToneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRingToneResponse setBody(DeleteRingToneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRingToneResponseBody getBody() {
        return this.body;
    }

}
