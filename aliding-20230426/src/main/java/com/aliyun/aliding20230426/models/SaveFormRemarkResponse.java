// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveFormRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveFormRemarkResponseBody body;

    public static SaveFormRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveFormRemarkResponse self = new SaveFormRemarkResponse();
        return TeaModel.build(map, self);
    }

    public SaveFormRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveFormRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveFormRemarkResponse setBody(SaveFormRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveFormRemarkResponseBody getBody() {
        return this.body;
    }

}
