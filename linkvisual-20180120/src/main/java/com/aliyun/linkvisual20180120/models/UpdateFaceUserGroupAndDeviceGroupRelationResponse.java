// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody body;

    public static UpdateFaceUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserGroupAndDeviceGroupRelationResponse self = new UpdateFaceUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setBody(UpdateFaceUserGroupAndDeviceGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

}
