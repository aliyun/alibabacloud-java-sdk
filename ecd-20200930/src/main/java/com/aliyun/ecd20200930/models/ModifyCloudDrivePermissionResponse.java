// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDrivePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudDrivePermissionResponseBody body;

    public static ModifyCloudDrivePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDrivePermissionResponse self = new ModifyCloudDrivePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDrivePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudDrivePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudDrivePermissionResponse setBody(ModifyCloudDrivePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudDrivePermissionResponseBody getBody() {
        return this.body;
    }

}
