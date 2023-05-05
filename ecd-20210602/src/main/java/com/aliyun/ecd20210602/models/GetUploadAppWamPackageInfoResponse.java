// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetUploadAppWamPackageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadAppWamPackageInfoResponseBody body;

    public static GetUploadAppWamPackageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadAppWamPackageInfoResponse self = new GetUploadAppWamPackageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadAppWamPackageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadAppWamPackageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadAppWamPackageInfoResponse setBody(GetUploadAppWamPackageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadAppWamPackageInfoResponseBody getBody() {
        return this.body;
    }

}
