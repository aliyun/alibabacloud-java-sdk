// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccUdpPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexAccUdpPortsResponseBody body;

    public static UpdateFlexAccUdpPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccUdpPortsResponse self = new UpdateFlexAccUdpPortsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccUdpPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexAccUdpPortsResponse setBody(UpdateFlexAccUdpPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexAccUdpPortsResponseBody getBody() {
        return this.body;
    }

}
