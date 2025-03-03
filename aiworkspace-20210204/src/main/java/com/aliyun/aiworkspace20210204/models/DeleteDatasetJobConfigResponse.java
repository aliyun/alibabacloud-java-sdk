// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetJobConfigResponseBody body;

    public static DeleteDatasetJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetJobConfigResponse self = new DeleteDatasetJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetJobConfigResponse setBody(DeleteDatasetJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetJobConfigResponseBody getBody() {
        return this.body;
    }

}
