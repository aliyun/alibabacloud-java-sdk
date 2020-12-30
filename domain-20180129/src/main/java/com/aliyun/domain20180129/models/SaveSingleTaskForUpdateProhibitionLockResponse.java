// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForUpdateProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForUpdateProhibitionLockResponseBody body;

    public static SaveSingleTaskForUpdateProhibitionLockResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForUpdateProhibitionLockResponse self = new SaveSingleTaskForUpdateProhibitionLockResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForUpdateProhibitionLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForUpdateProhibitionLockResponse setBody(SaveSingleTaskForUpdateProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForUpdateProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
