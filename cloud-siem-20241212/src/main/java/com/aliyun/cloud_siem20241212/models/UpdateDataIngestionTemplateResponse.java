// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataIngestionTemplateResponseBody body;

    public static UpdateDataIngestionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataIngestionTemplateResponse self = new UpdateDataIngestionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataIngestionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataIngestionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataIngestionTemplateResponse setBody(UpdateDataIngestionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataIngestionTemplateResponseBody getBody() {
        return this.body;
    }

}
