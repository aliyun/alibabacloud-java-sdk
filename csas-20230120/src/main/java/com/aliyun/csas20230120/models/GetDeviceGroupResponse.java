// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceGroupResponseBody body;

    public static GetDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceGroupResponse self = new GetDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceGroupResponse setBody(GetDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
