// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateDeviceAbilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceAbilityResponseBody body;

    public static UpdateDeviceAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceAbilityResponse self = new UpdateDeviceAbilityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceAbilityResponse setBody(UpdateDeviceAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceAbilityResponseBody getBody() {
        return this.body;
    }

}
