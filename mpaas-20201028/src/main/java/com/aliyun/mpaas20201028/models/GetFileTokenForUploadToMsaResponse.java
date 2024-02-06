// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetFileTokenForUploadToMsaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileTokenForUploadToMsaResponseBody body;

    public static GetFileTokenForUploadToMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileTokenForUploadToMsaResponse self = new GetFileTokenForUploadToMsaResponse();
        return TeaModel.build(map, self);
    }

    public GetFileTokenForUploadToMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileTokenForUploadToMsaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileTokenForUploadToMsaResponse setBody(GetFileTokenForUploadToMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileTokenForUploadToMsaResponseBody getBody() {
        return this.body;
    }

}
