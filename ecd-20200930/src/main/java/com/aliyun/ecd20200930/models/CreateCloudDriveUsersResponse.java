// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCloudDriveUsersResponseBody body;

    public static CreateCloudDriveUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveUsersResponse self = new CreateCloudDriveUsersResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudDriveUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudDriveUsersResponse setBody(CreateCloudDriveUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

}
