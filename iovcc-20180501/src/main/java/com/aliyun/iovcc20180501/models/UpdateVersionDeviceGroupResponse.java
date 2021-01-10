// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateVersionDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVersionDeviceGroupResponseBody body;

    public static UpdateVersionDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionDeviceGroupResponse self = new UpdateVersionDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVersionDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVersionDeviceGroupResponse setBody(UpdateVersionDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVersionDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
