// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UndoRtcNumberAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UndoRtcNumberAuthResponseBody body;

    public static UndoRtcNumberAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        UndoRtcNumberAuthResponse self = new UndoRtcNumberAuthResponse();
        return TeaModel.build(map, self);
    }

    public UndoRtcNumberAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UndoRtcNumberAuthResponse setBody(UndoRtcNumberAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public UndoRtcNumberAuthResponseBody getBody() {
        return this.body;
    }

}
