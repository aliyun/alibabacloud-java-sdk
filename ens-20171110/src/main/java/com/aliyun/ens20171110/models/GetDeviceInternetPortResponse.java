// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetDeviceInternetPortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceInternetPortResponseBody body;

    public static GetDeviceInternetPortResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInternetPortResponse self = new GetDeviceInternetPortResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceInternetPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceInternetPortResponse setBody(GetDeviceInternetPortResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceInternetPortResponseBody getBody() {
        return this.body;
    }

}
