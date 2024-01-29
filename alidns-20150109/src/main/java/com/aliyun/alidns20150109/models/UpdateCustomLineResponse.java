// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCustomLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomLineResponseBody body;

    public static UpdateCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLineResponse self = new UpdateCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomLineResponse setBody(UpdateCustomLineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomLineResponseBody getBody() {
        return this.body;
    }

}
