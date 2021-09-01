// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class StopOrStartAbilityByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopOrStartAbilityByDeviceIdResponseBody body;

    public static StopOrStartAbilityByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        StopOrStartAbilityByDeviceIdResponse self = new StopOrStartAbilityByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public StopOrStartAbilityByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopOrStartAbilityByDeviceIdResponse setBody(StopOrStartAbilityByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public StopOrStartAbilityByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
