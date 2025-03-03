// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetJobResponseBody body;

    public static CreateDatasetJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetJobResponse self = new CreateDatasetJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetJobResponse setBody(CreateDatasetJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetJobResponseBody getBody() {
        return this.body;
    }

}
