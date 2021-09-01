// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class StopDeviceAbilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDeviceAbilityResponseBody body;

    public static StopDeviceAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDeviceAbilityResponse self = new StopDeviceAbilityResponse();
        return TeaModel.build(map, self);
    }

    public StopDeviceAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDeviceAbilityResponse setBody(StopDeviceAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDeviceAbilityResponseBody getBody() {
        return this.body;
    }

}
