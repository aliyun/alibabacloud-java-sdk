// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetVehicleTrackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVehicleTrackResponseBody body;

    public static GetVehicleTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleTrackResponse self = new GetVehicleTrackResponse();
        return TeaModel.build(map, self);
    }

    public GetVehicleTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVehicleTrackResponse setBody(GetVehicleTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVehicleTrackResponseBody getBody() {
        return this.body;
    }

}
