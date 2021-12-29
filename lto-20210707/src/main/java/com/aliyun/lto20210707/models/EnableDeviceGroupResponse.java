// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class EnableDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDeviceGroupResponseBody body;

    public static EnableDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDeviceGroupResponse self = new EnableDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public EnableDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDeviceGroupResponse setBody(EnableDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
