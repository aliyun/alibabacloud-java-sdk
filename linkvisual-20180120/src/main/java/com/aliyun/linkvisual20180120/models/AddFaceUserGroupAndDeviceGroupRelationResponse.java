// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddFaceUserGroupAndDeviceGroupRelationResponse setBody(AddFaceUserGroupAndDeviceGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

}
