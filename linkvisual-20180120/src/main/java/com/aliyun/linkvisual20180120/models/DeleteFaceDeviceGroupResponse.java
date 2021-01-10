// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceDeviceGroupResponseBody body;

    public static DeleteFaceDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDeviceGroupResponse self = new DeleteFaceDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceDeviceGroupResponse setBody(DeleteFaceDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
