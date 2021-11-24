// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserByDeviceIdResponseBody body;

    public static GetUserByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByDeviceIdResponse self = new GetUserByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByDeviceIdResponse setBody(GetUserByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
