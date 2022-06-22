// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetNetworkDeviceParamOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNetworkDeviceParamOptionsResponseBody body;

    public static GetNetworkDeviceParamOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkDeviceParamOptionsResponse self = new GetNetworkDeviceParamOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkDeviceParamOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkDeviceParamOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkDeviceParamOptionsResponse setBody(GetNetworkDeviceParamOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkDeviceParamOptionsResponseBody getBody() {
        return this.body;
    }

}
