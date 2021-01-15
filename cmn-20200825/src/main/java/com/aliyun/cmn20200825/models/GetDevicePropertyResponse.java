// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDevicePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevicePropertyResponseBody body;

    public static GetDevicePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePropertyResponse self = new GetDevicePropertyResponse();
        return TeaModel.build(map, self);
    }

    public GetDevicePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevicePropertyResponse setBody(GetDevicePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevicePropertyResponseBody getBody() {
        return this.body;
    }

}
