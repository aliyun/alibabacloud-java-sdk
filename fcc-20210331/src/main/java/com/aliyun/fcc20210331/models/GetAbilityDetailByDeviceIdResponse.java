// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAbilityDetailByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAbilityDetailByDeviceIdResponseBody body;

    public static GetAbilityDetailByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAbilityDetailByDeviceIdResponse self = new GetAbilityDetailByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAbilityDetailByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAbilityDetailByDeviceIdResponse setBody(GetAbilityDetailByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAbilityDetailByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
