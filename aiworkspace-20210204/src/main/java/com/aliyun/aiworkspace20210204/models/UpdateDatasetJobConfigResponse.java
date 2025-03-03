// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatasetJobConfigResponseBody body;

    public static UpdateDatasetJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetJobConfigResponse self = new UpdateDatasetJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasetJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasetJobConfigResponse setBody(UpdateDatasetJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetJobConfigResponseBody getBody() {
        return this.body;
    }

}
