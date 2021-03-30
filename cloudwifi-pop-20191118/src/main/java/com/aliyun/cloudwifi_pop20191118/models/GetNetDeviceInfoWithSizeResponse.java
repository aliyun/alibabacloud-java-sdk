// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoWithSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNetDeviceInfoWithSizeResponseBody body;

    public static GetNetDeviceInfoWithSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoWithSizeResponse self = new GetNetDeviceInfoWithSizeResponse();
        return TeaModel.build(map, self);
    }

    public GetNetDeviceInfoWithSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetDeviceInfoWithSizeResponse setBody(GetNetDeviceInfoWithSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetDeviceInfoWithSizeResponseBody getBody() {
        return this.body;
    }

}
