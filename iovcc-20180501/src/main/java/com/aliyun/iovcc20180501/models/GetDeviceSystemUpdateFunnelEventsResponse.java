// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetDeviceSystemUpdateFunnelEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceSystemUpdateFunnelEventsResponseBody body;

    public static GetDeviceSystemUpdateFunnelEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceSystemUpdateFunnelEventsResponse self = new GetDeviceSystemUpdateFunnelEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceSystemUpdateFunnelEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceSystemUpdateFunnelEventsResponse setBody(GetDeviceSystemUpdateFunnelEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceSystemUpdateFunnelEventsResponseBody getBody() {
        return this.body;
    }

}
