// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCommercialVehicleDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCommercialVehicleDevicesResponseBody body;

    public static ListCommercialVehicleDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialVehicleDevicesResponse self = new ListCommercialVehicleDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListCommercialVehicleDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommercialVehicleDevicesResponse setBody(ListCommercialVehicleDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommercialVehicleDevicesResponseBody getBody() {
        return this.body;
    }

}
