// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class RecalculateCarbonEmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecalculateCarbonEmissionResponseBody body;

    public static RecalculateCarbonEmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecalculateCarbonEmissionResponse self = new RecalculateCarbonEmissionResponse();
        return TeaModel.build(map, self);
    }

    public RecalculateCarbonEmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecalculateCarbonEmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecalculateCarbonEmissionResponse setBody(RecalculateCarbonEmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecalculateCarbonEmissionResponseBody getBody() {
        return this.body;
    }

}
