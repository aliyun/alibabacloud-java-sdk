// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdateProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForUpdateProhibitionLockResponseBody body;

    public static SaveBatchTaskForUpdateProhibitionLockResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdateProhibitionLockResponse self = new SaveBatchTaskForUpdateProhibitionLockResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdateProhibitionLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForUpdateProhibitionLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForUpdateProhibitionLockResponse setBody(SaveBatchTaskForUpdateProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForUpdateProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
