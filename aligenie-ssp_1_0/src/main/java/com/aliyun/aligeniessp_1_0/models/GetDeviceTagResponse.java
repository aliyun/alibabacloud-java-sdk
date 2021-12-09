// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceTagResponseBody body;

    public static GetDeviceTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTagResponse self = new GetDeviceTagResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceTagResponse setBody(GetDeviceTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceTagResponseBody getBody() {
        return this.body;
    }

}
