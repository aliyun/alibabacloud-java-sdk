// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeviceGroupResponseBody body;

    public static CreateDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupResponse self = new CreateDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceGroupResponse setBody(CreateDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
