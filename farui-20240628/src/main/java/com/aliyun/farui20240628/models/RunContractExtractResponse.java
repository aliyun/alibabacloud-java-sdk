// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractExtractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunContractExtractResponseBody body;

    public static RunContractExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        RunContractExtractResponse self = new RunContractExtractResponse();
        return TeaModel.build(map, self);
    }

    public RunContractExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunContractExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunContractExtractResponse setBody(RunContractExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public RunContractExtractResponseBody getBody() {
        return this.body;
    }

}
