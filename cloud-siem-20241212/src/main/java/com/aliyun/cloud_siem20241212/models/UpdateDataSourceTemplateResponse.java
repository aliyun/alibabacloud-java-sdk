// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSourceTemplateResponseBody body;

    public static UpdateDataSourceTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceTemplateResponse self = new UpdateDataSourceTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSourceTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSourceTemplateResponse setBody(UpdateDataSourceTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSourceTemplateResponseBody getBody() {
        return this.body;
    }

}
