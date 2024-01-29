// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPackageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPackageJobResponseBody body;

    public static SubmitPackageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPackageJobResponse self = new SubmitPackageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPackageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPackageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPackageJobResponse setBody(SubmitPackageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPackageJobResponseBody getBody() {
        return this.body;
    }

}
