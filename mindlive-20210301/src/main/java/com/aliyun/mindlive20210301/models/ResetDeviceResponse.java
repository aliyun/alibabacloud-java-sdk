// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ResetDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetDeviceResponseBody body;

    public static ResetDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceResponse self = new ResetDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ResetDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDeviceResponse setBody(ResetDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDeviceResponseBody getBody() {
        return this.body;
    }

}
