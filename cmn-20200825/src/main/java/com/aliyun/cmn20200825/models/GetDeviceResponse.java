// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceResponseBody body;

    public static GetDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceResponse self = new GetDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceResponse setBody(GetDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceResponseBody getBody() {
        return this.body;
    }

}
