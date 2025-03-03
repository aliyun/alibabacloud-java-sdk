// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatasetJobResponseBody body;

    public static UpdateDatasetJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetJobResponse self = new UpdateDatasetJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasetJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasetJobResponse setBody(UpdateDatasetJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetJobResponseBody getBody() {
        return this.body;
    }

}
