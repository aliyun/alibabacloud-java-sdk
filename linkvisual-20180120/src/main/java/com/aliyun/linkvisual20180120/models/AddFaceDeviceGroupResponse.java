// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFaceDeviceGroupResponseBody body;

    public static AddFaceDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceGroupResponse self = new AddFaceDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceDeviceGroupResponse setBody(AddFaceDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
