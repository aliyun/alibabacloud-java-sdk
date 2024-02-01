// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteFaceDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceDeviceGroupResponse setBody(DeleteFaceDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
