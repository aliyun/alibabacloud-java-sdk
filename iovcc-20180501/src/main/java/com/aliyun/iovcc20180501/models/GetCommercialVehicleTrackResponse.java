// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetCommercialVehicleTrackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCommercialVehicleTrackResponseBody body;

    public static GetCommercialVehicleTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialVehicleTrackResponse self = new GetCommercialVehicleTrackResponse();
        return TeaModel.build(map, self);
    }

    public GetCommercialVehicleTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommercialVehicleTrackResponse setBody(GetCommercialVehicleTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommercialVehicleTrackResponseBody getBody() {
        return this.body;
    }

}
