// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class RecoverAppConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverAppConfigHistoryResponseBody body;

    public static RecoverAppConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverAppConfigHistoryResponse self = new RecoverAppConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public RecoverAppConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverAppConfigHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverAppConfigHistoryResponse setBody(RecoverAppConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverAppConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
