// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppUploadProcessInMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetUserAppUploadProcessInMsaResponse setBody(GetUserAppUploadProcessInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAppUploadProcessInMsaResponseBody getBody() {
        return this.body;
    }

}
