// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceFormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceFormResponseBody body;

    public static GetDeviceFormResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceFormResponse self = new GetDeviceFormResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceFormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceFormResponse setBody(GetDeviceFormResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceFormResponseBody getBody() {
        return this.body;
    }

}
