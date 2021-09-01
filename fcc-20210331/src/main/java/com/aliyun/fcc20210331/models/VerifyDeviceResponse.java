// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class VerifyDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyDeviceResponseBody body;

    public static VerifyDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceResponse self = new VerifyDeviceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyDeviceResponse setBody(VerifyDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyDeviceResponseBody getBody() {
        return this.body;
    }

}
