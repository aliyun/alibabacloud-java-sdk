// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForApplyQuickTransferOutOpenlyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody body;

    public static SaveBatchTaskForApplyQuickTransferOutOpenlyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForApplyQuickTransferOutOpenlyResponse self = new SaveBatchTaskForApplyQuickTransferOutOpenlyResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponse setBody(SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody getBody() {
        return this.body;
    }

}
