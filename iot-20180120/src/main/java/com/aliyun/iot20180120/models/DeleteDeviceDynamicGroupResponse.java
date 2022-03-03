// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceDynamicGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceDynamicGroupResponseBody body;

    public static DeleteDeviceDynamicGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceDynamicGroupResponse self = new DeleteDeviceDynamicGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceDynamicGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceDynamicGroupResponse setBody(DeleteDeviceDynamicGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceDynamicGroupResponseBody getBody() {
        return this.body;
    }

}
