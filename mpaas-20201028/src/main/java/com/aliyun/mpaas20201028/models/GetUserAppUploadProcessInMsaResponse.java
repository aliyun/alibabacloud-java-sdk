// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppUploadProcessInMsaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserAppUploadProcessInMsaResponseBody body;

    public static GetUserAppUploadProcessInMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppUploadProcessInMsaResponse self = new GetUserAppUploadProcessInMsaResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAppUploadProcessInMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAppUploadProcessInMsaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserAppUploadProcessInMsaResponse setBody(GetUserAppUploadProcessInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAppUploadProcessInMsaResponseBody getBody() {
        return this.body;
    }

}
