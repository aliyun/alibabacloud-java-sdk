// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForTransferProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveBatchTaskForTransferProhibitionLockResponse setBody(SaveBatchTaskForTransferProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForTransferProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
