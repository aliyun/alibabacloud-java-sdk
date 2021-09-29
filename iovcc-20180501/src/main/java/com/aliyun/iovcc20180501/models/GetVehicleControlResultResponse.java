// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetVehicleControlResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVehicleControlResultResponseBody body;

    public static GetVehicleControlResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleControlResultResponse self = new GetVehicleControlResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVehicleControlResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVehicleControlResultResponse setBody(GetVehicleControlResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVehicleControlResultResponseBody getBody() {
        return this.body;
    }

}
