// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ProcessPublicCloudIDEContractTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProcessPublicCloudIDEContractTransactionResponseBody body;

    public static ProcessPublicCloudIDEContractTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessPublicCloudIDEContractTransactionResponse self = new ProcessPublicCloudIDEContractTransactionResponse();
        return TeaModel.build(map, self);
    }

    public ProcessPublicCloudIDEContractTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessPublicCloudIDEContractTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProcessPublicCloudIDEContractTransactionResponse setBody(ProcessPublicCloudIDEContractTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessPublicCloudIDEContractTransactionResponseBody getBody() {
        return this.body;
    }

}
