// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetFileTokenForUploadToMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetFileTokenForUploadToMsaResponse setBody(GetFileTokenForUploadToMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileTokenForUploadToMsaResponseBody getBody() {
        return this.body;
    }

}
