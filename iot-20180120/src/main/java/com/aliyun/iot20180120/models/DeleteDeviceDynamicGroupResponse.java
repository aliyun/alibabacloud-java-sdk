// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceDynamicGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteDeviceDynamicGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceDynamicGroupResponse setBody(DeleteDeviceDynamicGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceDynamicGroupResponseBody getBody() {
        return this.body;
    }

}
