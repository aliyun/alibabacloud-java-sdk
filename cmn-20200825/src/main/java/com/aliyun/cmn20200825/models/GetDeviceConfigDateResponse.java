// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigDateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceConfigDateResponseBody body;

    public static GetDeviceConfigDateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigDateResponse self = new GetDeviceConfigDateResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigDateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceConfigDateResponse setBody(GetDeviceConfigDateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceConfigDateResponseBody getBody() {
        return this.body;
    }

}
