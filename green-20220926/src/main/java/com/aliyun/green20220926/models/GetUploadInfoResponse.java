// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadInfoResponseBody body;

    public static GetUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadInfoResponse self = new GetUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadInfoResponse setBody(GetUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadInfoResponseBody getBody() {
        return this.body;
    }

}
