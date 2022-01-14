// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppDonwloadUrlInMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserAppDonwloadUrlInMsaResponseBody body;

    public static GetUserAppDonwloadUrlInMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppDonwloadUrlInMsaResponse self = new GetUserAppDonwloadUrlInMsaResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAppDonwloadUrlInMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAppDonwloadUrlInMsaResponse setBody(GetUserAppDonwloadUrlInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAppDonwloadUrlInMsaResponseBody getBody() {
        return this.body;
    }

}
