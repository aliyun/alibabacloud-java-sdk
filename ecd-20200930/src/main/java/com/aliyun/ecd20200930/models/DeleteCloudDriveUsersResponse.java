// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudDriveUsersResponseBody body;

    public static DeleteCloudDriveUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveUsersResponse self = new DeleteCloudDriveUsersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudDriveUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudDriveUsersResponse setBody(DeleteCloudDriveUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

}
