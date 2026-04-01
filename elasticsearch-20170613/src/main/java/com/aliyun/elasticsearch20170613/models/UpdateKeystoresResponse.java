// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKeystoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKeystoresResponseBody body;

    public static UpdateKeystoresResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeystoresResponse self = new UpdateKeystoresResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKeystoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKeystoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKeystoresResponse setBody(UpdateKeystoresResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKeystoresResponseBody getBody() {
        return this.body;
    }

}
