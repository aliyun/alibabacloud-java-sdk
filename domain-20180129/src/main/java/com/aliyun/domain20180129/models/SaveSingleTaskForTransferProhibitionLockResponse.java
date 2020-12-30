// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForTransferProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForTransferProhibitionLockResponseBody body;

    public static SaveSingleTaskForTransferProhibitionLockResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForTransferProhibitionLockResponse self = new SaveSingleTaskForTransferProhibitionLockResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForTransferProhibitionLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForTransferProhibitionLockResponse setBody(SaveSingleTaskForTransferProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForTransferProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
