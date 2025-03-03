// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetJobConfigResponseBody body;

    public static CreateDatasetJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetJobConfigResponse self = new CreateDatasetJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetJobConfigResponse setBody(CreateDatasetJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetJobConfigResponseBody getBody() {
        return this.body;
    }

}
