// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExpertiseResponseBody body;

    public static UpdateExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExpertiseResponse self = new UpdateExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExpertiseResponse setBody(UpdateExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExpertiseResponseBody getBody() {
        return this.body;
    }

}
