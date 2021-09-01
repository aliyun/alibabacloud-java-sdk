// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAbilityConfigListByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAbilityConfigListByDeviceIdResponseBody body;

    public static GetAbilityConfigListByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAbilityConfigListByDeviceIdResponse self = new GetAbilityConfigListByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAbilityConfigListByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAbilityConfigListByDeviceIdResponse setBody(GetAbilityConfigListByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAbilityConfigListByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
