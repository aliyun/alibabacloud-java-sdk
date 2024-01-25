// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForCreatingOrderTransferResponseBody body;

    public static SaveBatchTaskForCreatingOrderTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderTransferResponse self = new SaveBatchTaskForCreatingOrderTransferResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForCreatingOrderTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForCreatingOrderTransferResponse setBody(SaveBatchTaskForCreatingOrderTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderTransferResponseBody getBody() {
        return this.body;
    }

}
