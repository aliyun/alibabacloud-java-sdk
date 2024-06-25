// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSmsSignResponseBody body;

    public static DeleteSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsSignResponse self = new DeleteSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSmsSignResponse setBody(DeleteSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmsSignResponseBody getBody() {
        return this.body;
    }

}
