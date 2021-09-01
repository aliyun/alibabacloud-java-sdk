// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class BindEdgeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindEdgeDeviceResponseBody body;

    public static BindEdgeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEdgeDeviceResponse self = new BindEdgeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindEdgeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEdgeDeviceResponse setBody(BindEdgeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEdgeDeviceResponseBody getBody() {
        return this.body;
    }

}
