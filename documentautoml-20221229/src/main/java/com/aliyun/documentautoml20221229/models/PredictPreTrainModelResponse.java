// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictPreTrainModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PredictPreTrainModelResponseBody body;

    public static PredictPreTrainModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictPreTrainModelResponse self = new PredictPreTrainModelResponse();
        return TeaModel.build(map, self);
    }

    public PredictPreTrainModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictPreTrainModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictPreTrainModelResponse setBody(PredictPreTrainModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictPreTrainModelResponseBody getBody() {
        return this.body;
    }

}
