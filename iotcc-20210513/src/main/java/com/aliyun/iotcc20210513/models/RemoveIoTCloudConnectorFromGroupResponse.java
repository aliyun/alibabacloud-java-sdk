// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class RemoveIoTCloudConnectorFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveIoTCloudConnectorFromGroupResponseBody body;

    public static RemoveIoTCloudConnectorFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIoTCloudConnectorFromGroupResponse self = new RemoveIoTCloudConnectorFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIoTCloudConnectorFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveIoTCloudConnectorFromGroupResponse setBody(RemoveIoTCloudConnectorFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveIoTCloudConnectorFromGroupResponseBody getBody() {
        return this.body;
    }

}
