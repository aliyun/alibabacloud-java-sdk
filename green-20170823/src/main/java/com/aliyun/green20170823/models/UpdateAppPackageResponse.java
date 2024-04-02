// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAppPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppPackageResponseBody body;

    public static UpdateAppPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPackageResponse self = new UpdateAppPackageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppPackageResponse setBody(UpdateAppPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppPackageResponseBody getBody() {
        return this.body;
    }

}
