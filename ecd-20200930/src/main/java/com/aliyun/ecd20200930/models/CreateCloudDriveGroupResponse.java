// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudDriveGroupResponseBody body;

    public static CreateCloudDriveGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveGroupResponse self = new CreateCloudDriveGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudDriveGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudDriveGroupResponse setBody(CreateCloudDriveGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudDriveGroupResponseBody getBody() {
        return this.body;
    }

}
