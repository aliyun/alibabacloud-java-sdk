// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudDriveGroupsResponseBody body;

    public static ModifyCloudDriveGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveGroupsResponse self = new ModifyCloudDriveGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudDriveGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudDriveGroupsResponse setBody(ModifyCloudDriveGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudDriveGroupsResponseBody getBody() {
        return this.body;
    }

}
