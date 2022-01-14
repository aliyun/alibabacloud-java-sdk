// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadUserAppToMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadUserAppToMsaResponseBody body;

    public static UploadUserAppToMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadUserAppToMsaResponse self = new UploadUserAppToMsaResponse();
        return TeaModel.build(map, self);
    }

    public UploadUserAppToMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadUserAppToMsaResponse setBody(UploadUserAppToMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadUserAppToMsaResponseBody getBody() {
        return this.body;
    }

}
