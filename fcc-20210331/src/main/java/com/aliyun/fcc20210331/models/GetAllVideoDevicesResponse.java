// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAllVideoDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllVideoDevicesResponseBody body;

    public static GetAllVideoDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllVideoDevicesResponse self = new GetAllVideoDevicesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllVideoDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllVideoDevicesResponse setBody(GetAllVideoDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllVideoDevicesResponseBody getBody() {
        return this.body;
    }

}
