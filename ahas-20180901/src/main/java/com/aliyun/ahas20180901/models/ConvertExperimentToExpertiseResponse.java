// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ConvertExperimentToExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertExperimentToExpertiseResponseBody body;

    public static ConvertExperimentToExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertExperimentToExpertiseResponse self = new ConvertExperimentToExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public ConvertExperimentToExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertExperimentToExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertExperimentToExpertiseResponse setBody(ConvertExperimentToExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertExperimentToExpertiseResponseBody getBody() {
        return this.body;
    }

}
