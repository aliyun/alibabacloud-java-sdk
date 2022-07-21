// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForCreatingOrderTransferResponseBody body;

    public static SaveSingleTaskForCreatingOrderTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderTransferResponse self = new SaveSingleTaskForCreatingOrderTransferResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingOrderTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForCreatingOrderTransferResponse setBody(SaveSingleTaskForCreatingOrderTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderTransferResponseBody getBody() {
        return this.body;
    }

}
