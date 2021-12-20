// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AddIoTCloudConnectorToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddIoTCloudConnectorToGroupResponseBody body;

    public static AddIoTCloudConnectorToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIoTCloudConnectorToGroupResponse self = new AddIoTCloudConnectorToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddIoTCloudConnectorToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIoTCloudConnectorToGroupResponse setBody(AddIoTCloudConnectorToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIoTCloudConnectorToGroupResponseBody getBody() {
        return this.body;
    }

}
