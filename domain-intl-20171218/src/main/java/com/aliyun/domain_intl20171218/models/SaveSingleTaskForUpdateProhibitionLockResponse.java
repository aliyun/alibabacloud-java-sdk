// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForUpdateProhibitionLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveSingleTaskForUpdateProhibitionLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForUpdateProhibitionLockResponse setBody(SaveSingleTaskForUpdateProhibitionLockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForUpdateProhibitionLockResponseBody getBody() {
        return this.body;
    }

}
