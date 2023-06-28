// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCloudDriveUsersResponseBody body;

    public static ModifyCloudDriveUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveUsersResponse self = new ModifyCloudDriveUsersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudDriveUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudDriveUsersResponse setBody(ModifyCloudDriveUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

}
