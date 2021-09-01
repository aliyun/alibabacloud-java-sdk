// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetVideoDeviceByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoDeviceByIdResponseBody body;

    public static GetVideoDeviceByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDeviceByIdResponse self = new GetVideoDeviceByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoDeviceByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoDeviceByIdResponse setBody(GetVideoDeviceByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoDeviceByIdResponseBody getBody() {
        return this.body;
    }

}
