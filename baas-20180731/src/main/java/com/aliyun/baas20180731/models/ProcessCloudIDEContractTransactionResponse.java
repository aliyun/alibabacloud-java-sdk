// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ProcessCloudIDEContractTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProcessCloudIDEContractTransactionResponseBody body;

    public static ProcessCloudIDEContractTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessCloudIDEContractTransactionResponse self = new ProcessCloudIDEContractTransactionResponse();
        return TeaModel.build(map, self);
    }

    public ProcessCloudIDEContractTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessCloudIDEContractTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProcessCloudIDEContractTransactionResponse setBody(ProcessCloudIDEContractTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessCloudIDEContractTransactionResponseBody getBody() {
        return this.body;
    }

}
