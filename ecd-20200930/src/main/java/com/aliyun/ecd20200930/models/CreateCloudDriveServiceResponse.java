// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateCloudDriveServiceResponse setBody(CreateCloudDriveServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudDriveServiceResponseBody getBody() {
        return this.body;
    }

}
