// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateEdgeDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEdgeDevicesResponseBody body;

    public static UpdateEdgeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeDevicesResponse self = new UpdateEdgeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeDevicesResponse setBody(UpdateEdgeDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeDevicesResponseBody getBody() {
        return this.body;
    }

}
