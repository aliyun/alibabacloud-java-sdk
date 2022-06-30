// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateDatasetDeployTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDatasetDeployTaskResponseBody body;

    public static CreateDatasetDeployTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetDeployTaskResponse self = new CreateDatasetDeployTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetDeployTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetDeployTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetDeployTaskResponse setBody(CreateDatasetDeployTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetDeployTaskResponseBody getBody() {
        return this.body;
    }

}
