// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRtcTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRtcTokenResponseBody body;

    public static GetRtcTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRtcTokenResponse self = new GetRtcTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetRtcTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRtcTokenResponse setBody(GetRtcTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRtcTokenResponseBody getBody() {
        return this.body;
    }

}
