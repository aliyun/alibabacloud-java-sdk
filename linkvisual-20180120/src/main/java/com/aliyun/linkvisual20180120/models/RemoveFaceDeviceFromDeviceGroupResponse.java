// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceDeviceFromDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemoveFaceDeviceFromDeviceGroupResponse setBody(RemoveFaceDeviceFromDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFaceDeviceFromDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
