// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIoTCloudConnectorGroupResponseBody body;

    public static CreateIoTCloudConnectorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorGroupResponse self = new CreateIoTCloudConnectorGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIoTCloudConnectorGroupResponse setBody(CreateIoTCloudConnectorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIoTCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

}
