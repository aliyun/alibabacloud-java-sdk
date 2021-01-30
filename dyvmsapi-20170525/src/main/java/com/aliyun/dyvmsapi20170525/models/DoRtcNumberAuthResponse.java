// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DoRtcNumberAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoRtcNumberAuthResponseBody body;

    public static DoRtcNumberAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        DoRtcNumberAuthResponse self = new DoRtcNumberAuthResponse();
        return TeaModel.build(map, self);
    }

    public DoRtcNumberAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoRtcNumberAuthResponse setBody(DoRtcNumberAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public DoRtcNumberAuthResponseBody getBody() {
        return this.body;
    }

}
