// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetCommercialVehicleDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCommercialVehicleDeviceResponseBody body;

    public static GetCommercialVehicleDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialVehicleDeviceResponse self = new GetCommercialVehicleDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GetCommercialVehicleDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommercialVehicleDeviceResponse setBody(GetCommercialVehicleDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommercialVehicleDeviceResponseBody getBody() {
        return this.body;
    }

}
