// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetDeviceInfoByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceInfoByIdResponseBody body;

    public static GetDeviceInfoByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoByIdResponse self = new GetDeviceInfoByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceInfoByIdResponse setBody(GetDeviceInfoByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceInfoByIdResponseBody getBody() {
        return this.body;
    }

}
