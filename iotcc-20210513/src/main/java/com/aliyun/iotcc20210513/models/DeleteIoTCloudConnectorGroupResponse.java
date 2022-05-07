// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnectorGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIoTCloudConnectorGroupResponseBody body;

    public static DeleteIoTCloudConnectorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnectorGroupResponse self = new DeleteIoTCloudConnectorGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnectorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIoTCloudConnectorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIoTCloudConnectorGroupResponse setBody(DeleteIoTCloudConnectorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIoTCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

}
