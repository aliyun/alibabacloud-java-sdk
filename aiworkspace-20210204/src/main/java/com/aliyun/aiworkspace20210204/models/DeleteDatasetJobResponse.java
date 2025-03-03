// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetJobResponseBody body;

    public static DeleteDatasetJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetJobResponse self = new DeleteDatasetJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetJobResponse setBody(DeleteDatasetJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetJobResponseBody getBody() {
        return this.body;
    }

}
