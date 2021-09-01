// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddDeviceAbilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDeviceAbilityResponseBody body;

    public static AddDeviceAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceAbilityResponse self = new AddDeviceAbilityResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceAbilityResponse setBody(AddDeviceAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceAbilityResponseBody getBody() {
        return this.body;
    }

}
