// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateWabaMmlStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWabaMmlStatusResponseBody body;

    public static UpdateWabaMmlStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWabaMmlStatusResponse self = new UpdateWabaMmlStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWabaMmlStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWabaMmlStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWabaMmlStatusResponse setBody(UpdateWabaMmlStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWabaMmlStatusResponseBody getBody() {
        return this.body;
    }

}
