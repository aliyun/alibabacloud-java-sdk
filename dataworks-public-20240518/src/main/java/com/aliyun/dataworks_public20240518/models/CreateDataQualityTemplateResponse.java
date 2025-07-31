// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataQualityTemplateResponseBody body;

    public static CreateDataQualityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityTemplateResponse self = new CreateDataQualityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataQualityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataQualityTemplateResponse setBody(CreateDataQualityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataQualityTemplateResponseBody getBody() {
        return this.body;
    }

}
