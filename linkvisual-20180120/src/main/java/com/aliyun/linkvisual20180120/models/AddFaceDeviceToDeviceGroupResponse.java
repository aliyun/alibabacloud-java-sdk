// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceToDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceDeviceToDeviceGroupResponseBody body;

    public static AddFaceDeviceToDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceToDeviceGroupResponse self = new AddFaceDeviceToDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceToDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceDeviceToDeviceGroupResponse setBody(AddFaceDeviceToDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceDeviceToDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
