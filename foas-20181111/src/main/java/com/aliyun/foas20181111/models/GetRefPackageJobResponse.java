// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetRefPackageJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRefPackageJobResponseBody body;

    public static GetRefPackageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRefPackageJobResponse self = new GetRefPackageJobResponse();
        return TeaModel.build(map, self);
    }

    public GetRefPackageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRefPackageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRefPackageJobResponse setBody(GetRefPackageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRefPackageJobResponseBody getBody() {
        return this.body;
    }

}
