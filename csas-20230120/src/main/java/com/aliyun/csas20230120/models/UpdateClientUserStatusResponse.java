// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClientUserStatusResponseBody body;

    public static UpdateClientUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserStatusResponse self = new UpdateClientUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClientUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClientUserStatusResponse setBody(UpdateClientUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClientUserStatusResponseBody getBody() {
        return this.body;
    }

}
