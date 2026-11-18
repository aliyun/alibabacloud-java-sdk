// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudDriveServicesResponseBody body;

    public static DeleteCloudDriveServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveServicesResponse self = new DeleteCloudDriveServicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudDriveServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudDriveServicesResponse setBody(DeleteCloudDriveServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudDriveServicesResponseBody getBody() {
        return this.body;
    }

}
