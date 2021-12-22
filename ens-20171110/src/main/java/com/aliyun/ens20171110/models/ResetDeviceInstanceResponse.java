// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetDeviceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetDeviceInstanceResponseBody body;

    public static ResetDeviceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceInstanceResponse self = new ResetDeviceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResetDeviceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDeviceInstanceResponse setBody(ResetDeviceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDeviceInstanceResponseBody getBody() {
        return this.body;
    }

}
