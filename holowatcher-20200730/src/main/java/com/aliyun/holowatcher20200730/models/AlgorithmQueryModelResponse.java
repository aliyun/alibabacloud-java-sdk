// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmQueryModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AlgorithmQueryModelResponseBody body;

    public static AlgorithmQueryModelResponse build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmQueryModelResponse self = new AlgorithmQueryModelResponse();
        return TeaModel.build(map, self);
    }

    public AlgorithmQueryModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlgorithmQueryModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AlgorithmQueryModelResponse setBody(AlgorithmQueryModelResponseBody body) {
        this.body = body;
        return this;
    }
    public AlgorithmQueryModelResponseBody getBody() {
        return this.body;
    }

}
