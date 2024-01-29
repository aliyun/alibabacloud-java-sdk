// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPackageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPackageJobResponseBody body;

    public static GetPackageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPackageJobResponse self = new GetPackageJobResponse();
        return TeaModel.build(map, self);
    }

    public GetPackageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPackageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPackageJobResponse setBody(GetPackageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackageJobResponseBody getBody() {
        return this.body;
    }

}
