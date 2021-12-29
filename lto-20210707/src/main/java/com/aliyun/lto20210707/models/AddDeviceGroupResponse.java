// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDeviceGroupResponseBody body;

    public static AddDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceGroupResponse self = new AddDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceGroupResponse setBody(AddDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
