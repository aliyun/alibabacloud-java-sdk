// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumFileStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRumFileStatusResponseBody body;

    public static UpdateRumFileStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRumFileStatusResponse self = new UpdateRumFileStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRumFileStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRumFileStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRumFileStatusResponse setBody(UpdateRumFileStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRumFileStatusResponseBody getBody() {
        return this.body;
    }

}
