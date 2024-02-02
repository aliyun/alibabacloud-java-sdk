// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDynamicGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeviceDynamicGroupResponseBody body;

    public static CreateDeviceDynamicGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDynamicGroupResponse self = new CreateDeviceDynamicGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDynamicGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceDynamicGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeviceDynamicGroupResponse setBody(CreateDeviceDynamicGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceDynamicGroupResponseBody getBody() {
        return this.body;
    }

}
