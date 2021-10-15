// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class ActivateApDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateApDeviceResponseBody body;

    public static ActivateApDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateApDeviceResponse self = new ActivateApDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateApDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateApDeviceResponse setBody(ActivateApDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateApDeviceResponseBody getBody() {
        return this.body;
    }

}
