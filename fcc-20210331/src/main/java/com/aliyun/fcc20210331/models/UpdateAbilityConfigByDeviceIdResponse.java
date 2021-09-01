// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateAbilityConfigByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAbilityConfigByDeviceIdResponseBody body;

    public static UpdateAbilityConfigByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbilityConfigByDeviceIdResponse self = new UpdateAbilityConfigByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAbilityConfigByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAbilityConfigByDeviceIdResponse setBody(UpdateAbilityConfigByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAbilityConfigByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
