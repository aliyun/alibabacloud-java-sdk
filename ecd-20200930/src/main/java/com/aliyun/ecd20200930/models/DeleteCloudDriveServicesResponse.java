// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteCloudDriveServicesResponse setBody(DeleteCloudDriveServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudDriveServicesResponseBody getBody() {
        return this.body;
    }

}
