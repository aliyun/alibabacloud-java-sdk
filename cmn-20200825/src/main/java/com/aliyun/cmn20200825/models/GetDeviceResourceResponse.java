// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceResourceResponseBody body;

    public static GetDeviceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceResourceResponse self = new GetDeviceResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceResourceResponse setBody(GetDeviceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceResourceResponseBody getBody() {
        return this.body;
    }

}
