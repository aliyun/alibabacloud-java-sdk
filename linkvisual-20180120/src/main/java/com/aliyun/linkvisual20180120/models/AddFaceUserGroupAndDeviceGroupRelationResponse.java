// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFaceUserGroupAndDeviceGroupRelationResponseBody body;

    public static AddFaceUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupAndDeviceGroupRelationResponse self = new AddFaceUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setBody(AddFaceUserGroupAndDeviceGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

}
