// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetDeviceAppUpdateFunnelEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceAppUpdateFunnelEventsResponseBody body;

    public static GetDeviceAppUpdateFunnelEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceAppUpdateFunnelEventsResponse self = new GetDeviceAppUpdateFunnelEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceAppUpdateFunnelEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceAppUpdateFunnelEventsResponse setBody(GetDeviceAppUpdateFunnelEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceAppUpdateFunnelEventsResponseBody getBody() {
        return this.body;
    }

}
