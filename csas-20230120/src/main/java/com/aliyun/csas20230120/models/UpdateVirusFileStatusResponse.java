// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusFileStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirusFileStatusResponseBody body;

    public static UpdateVirusFileStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirusFileStatusResponse self = new UpdateVirusFileStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirusFileStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirusFileStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirusFileStatusResponse setBody(UpdateVirusFileStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirusFileStatusResponseBody getBody() {
        return this.body;
    }

}
