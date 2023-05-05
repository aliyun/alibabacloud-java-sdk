// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateAppWamPackageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppWamPackageInfoResponseBody body;

    public static UpdateAppWamPackageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppWamPackageInfoResponse self = new UpdateAppWamPackageInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppWamPackageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppWamPackageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppWamPackageInfoResponse setBody(UpdateAppWamPackageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppWamPackageInfoResponseBody getBody() {
        return this.body;
    }

}
