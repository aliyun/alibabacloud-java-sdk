// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForTransferProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForTransferProhibitionLockResponseBody body;

    public static SaveBatchTaskForTransferProhibitionLockResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForTransferProhibitionLockResponse self = new SaveBatchTaskForTransferProhibitionLockResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForTransferProhibitionLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForTransferProhibitionLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForTransferProhibitionLockResponse setBody(SaveBatchTaskForTransferProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForTransferProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
