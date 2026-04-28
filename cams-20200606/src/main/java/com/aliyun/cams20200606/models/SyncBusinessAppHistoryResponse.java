// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SyncBusinessAppHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncBusinessAppHistoryResponseBody body;

    public static SyncBusinessAppHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncBusinessAppHistoryResponse self = new SyncBusinessAppHistoryResponse();
        return TeaModel.build(map, self);
    }

    public SyncBusinessAppHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncBusinessAppHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncBusinessAppHistoryResponse setBody(SyncBusinessAppHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncBusinessAppHistoryResponseBody getBody() {
        return this.body;
    }

}
