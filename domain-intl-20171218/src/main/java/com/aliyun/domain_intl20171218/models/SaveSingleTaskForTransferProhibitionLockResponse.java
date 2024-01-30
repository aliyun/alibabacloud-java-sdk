// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForTransferProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveSingleTaskForTransferProhibitionLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForTransferProhibitionLockResponse setBody(SaveSingleTaskForTransferProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForTransferProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
