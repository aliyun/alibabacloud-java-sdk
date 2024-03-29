// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudDriveGroupsResponseBody body;

    public static DeleteCloudDriveGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveGroupsResponse self = new DeleteCloudDriveGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudDriveGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudDriveGroupsResponse setBody(DeleteCloudDriveGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudDriveGroupsResponseBody getBody() {
        return this.body;
    }

}
