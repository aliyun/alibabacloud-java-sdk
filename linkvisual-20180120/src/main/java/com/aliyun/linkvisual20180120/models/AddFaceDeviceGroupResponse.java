// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceDeviceGroupResponseBody body;

    public static AddFaceDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceGroupResponse self = new AddFaceDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceDeviceGroupResponse setBody(AddFaceDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
