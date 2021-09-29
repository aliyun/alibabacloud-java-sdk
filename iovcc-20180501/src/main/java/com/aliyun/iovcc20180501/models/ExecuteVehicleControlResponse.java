// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteVehicleControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteVehicleControlResponseBody body;

    public static ExecuteVehicleControlResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteVehicleControlResponse self = new ExecuteVehicleControlResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteVehicleControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteVehicleControlResponse setBody(ExecuteVehicleControlResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteVehicleControlResponseBody getBody() {
        return this.body;
    }

}
