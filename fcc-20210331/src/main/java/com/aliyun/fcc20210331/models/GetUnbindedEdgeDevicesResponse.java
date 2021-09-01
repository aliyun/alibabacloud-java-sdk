// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetUnbindedEdgeDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnbindedEdgeDevicesResponseBody body;

    public static GetUnbindedEdgeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnbindedEdgeDevicesResponse self = new GetUnbindedEdgeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public GetUnbindedEdgeDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnbindedEdgeDevicesResponse setBody(GetUnbindedEdgeDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnbindedEdgeDevicesResponseBody getBody() {
        return this.body;
    }

}
