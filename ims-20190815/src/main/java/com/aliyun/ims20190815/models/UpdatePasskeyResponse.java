// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdatePasskeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePasskeyResponseBody body;

    public static UpdatePasskeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePasskeyResponse self = new UpdatePasskeyResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePasskeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePasskeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePasskeyResponse setBody(UpdatePasskeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePasskeyResponseBody getBody() {
        return this.body;
    }

}
