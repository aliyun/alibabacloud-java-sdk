// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForApplyQuickTransferOutOpenlyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody body;

    public static SaveSingleTaskForApplyQuickTransferOutOpenlyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForApplyQuickTransferOutOpenlyResponse self = new SaveSingleTaskForApplyQuickTransferOutOpenlyResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponse setBody(SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody getBody() {
        return this.body;
    }

}
