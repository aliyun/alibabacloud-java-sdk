// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class DeleteDeviceAllGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceAllGroupResponseBody body;

    public static DeleteDeviceAllGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceAllGroupResponse self = new DeleteDeviceAllGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceAllGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceAllGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceAllGroupResponse setBody(DeleteDeviceAllGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceAllGroupResponseBody getBody() {
        return this.body;
    }

}
