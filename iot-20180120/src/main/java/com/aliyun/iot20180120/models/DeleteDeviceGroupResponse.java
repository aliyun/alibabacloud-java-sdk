// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceGroupResponseBody body;

    public static DeleteDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceGroupResponse self = new DeleteDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceGroupResponse setBody(DeleteDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
