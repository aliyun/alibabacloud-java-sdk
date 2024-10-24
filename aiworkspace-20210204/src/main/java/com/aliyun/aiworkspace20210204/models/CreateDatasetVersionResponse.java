// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetVersionResponseBody body;

    public static CreateDatasetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionResponse self = new CreateDatasetVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetVersionResponse setBody(CreateDatasetVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetVersionResponseBody getBody() {
        return this.body;
    }

}
