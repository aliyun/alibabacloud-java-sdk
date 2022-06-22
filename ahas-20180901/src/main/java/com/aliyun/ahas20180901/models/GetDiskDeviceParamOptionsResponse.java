// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetDiskDeviceParamOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiskDeviceParamOptionsResponseBody body;

    public static GetDiskDeviceParamOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiskDeviceParamOptionsResponse self = new GetDiskDeviceParamOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetDiskDeviceParamOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiskDeviceParamOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiskDeviceParamOptionsResponse setBody(GetDiskDeviceParamOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiskDeviceParamOptionsResponseBody getBody() {
        return this.body;
    }

}
