// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceDeviceFromDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveFaceDeviceFromDeviceGroupResponseBody body;

    public static RemoveFaceDeviceFromDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveFaceDeviceFromDeviceGroupResponse self = new RemoveFaceDeviceFromDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveFaceDeviceFromDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveFaceDeviceFromDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveFaceDeviceFromDeviceGroupResponse setBody(RemoveFaceDeviceFromDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFaceDeviceFromDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
