// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RemoveEdgeDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEdgeDeviceInfoResponseBody body;

    public static RemoveEdgeDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEdgeDeviceInfoResponse self = new RemoveEdgeDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEdgeDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEdgeDeviceInfoResponse setBody(RemoveEdgeDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEdgeDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
