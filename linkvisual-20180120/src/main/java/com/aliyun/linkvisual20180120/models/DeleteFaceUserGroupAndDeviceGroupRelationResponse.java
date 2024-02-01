// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceUserGroupAndDeviceGroupRelationResponseBody body;

    public static DeleteFaceUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupAndDeviceGroupRelationResponse self = new DeleteFaceUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse setBody(DeleteFaceUserGroupAndDeviceGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

}
