// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudDriveServiceResponseBody body;

    public static CreateCloudDriveServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveServiceResponse self = new CreateCloudDriveServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudDriveServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudDriveServiceResponse setBody(CreateCloudDriveServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudDriveServiceResponseBody getBody() {
        return this.body;
    }

}
