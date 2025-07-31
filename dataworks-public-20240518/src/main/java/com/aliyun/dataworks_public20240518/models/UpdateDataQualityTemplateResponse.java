// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataQualityTemplateResponseBody body;

    public static UpdateDataQualityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityTemplateResponse self = new UpdateDataQualityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataQualityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataQualityTemplateResponse setBody(UpdateDataQualityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataQualityTemplateResponseBody getBody() {
        return this.body;
    }

}
