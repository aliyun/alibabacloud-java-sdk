// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAllEdgeDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllEdgeDevicesResponseBody body;

    public static GetAllEdgeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllEdgeDevicesResponse self = new GetAllEdgeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllEdgeDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllEdgeDevicesResponse setBody(GetAllEdgeDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllEdgeDevicesResponseBody getBody() {
        return this.body;
    }

}
