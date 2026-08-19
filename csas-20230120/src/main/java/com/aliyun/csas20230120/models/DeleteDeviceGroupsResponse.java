// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDeviceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceGroupsResponseBody body;

    public static DeleteDeviceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceGroupsResponse self = new DeleteDeviceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceGroupsResponse setBody(DeleteDeviceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceGroupsResponseBody getBody() {
        return this.body;
    }

}
