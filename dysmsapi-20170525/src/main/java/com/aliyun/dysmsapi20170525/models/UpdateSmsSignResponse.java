// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmsSignResponseBody body;

    public static UpdateSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsSignResponse self = new UpdateSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmsSignResponse setBody(UpdateSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmsSignResponseBody getBody() {
        return this.body;
    }

}
