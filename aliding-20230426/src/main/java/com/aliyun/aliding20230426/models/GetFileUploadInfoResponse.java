// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileUploadInfoResponseBody body;

    public static GetFileUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadInfoResponse self = new GetFileUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetFileUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileUploadInfoResponse setBody(GetFileUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileUploadInfoResponseBody getBody() {
        return this.body;
    }

}
