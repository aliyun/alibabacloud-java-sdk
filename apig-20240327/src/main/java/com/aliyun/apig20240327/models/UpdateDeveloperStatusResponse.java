// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateDeveloperStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeveloperStatusResponseBody body;

    public static UpdateDeveloperStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeveloperStatusResponse self = new UpdateDeveloperStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeveloperStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeveloperStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeveloperStatusResponse setBody(UpdateDeveloperStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeveloperStatusResponseBody getBody() {
        return this.body;
    }

}
