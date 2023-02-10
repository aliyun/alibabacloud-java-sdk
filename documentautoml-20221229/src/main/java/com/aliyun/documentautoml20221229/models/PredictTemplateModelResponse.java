// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictTemplateModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PredictTemplateModelResponseBody body;

    public static PredictTemplateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictTemplateModelResponse self = new PredictTemplateModelResponse();
        return TeaModel.build(map, self);
    }

    public PredictTemplateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictTemplateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictTemplateModelResponse setBody(PredictTemplateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictTemplateModelResponseBody getBody() {
        return this.body;
    }

}
