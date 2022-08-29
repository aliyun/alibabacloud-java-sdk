// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaSqlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrustDaSqlJobResponseBody body;

    public static GetTrustDaSqlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaSqlJobResponse self = new GetTrustDaSqlJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustDaSqlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustDaSqlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustDaSqlJobResponse setBody(GetTrustDaSqlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustDaSqlJobResponseBody getBody() {
        return this.body;
    }

}
