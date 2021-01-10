// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVersionDeviceGroupResponseBody body;

    public static CreateVersionDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionDeviceGroupResponse self = new CreateVersionDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateVersionDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVersionDeviceGroupResponse setBody(CreateVersionDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVersionDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
