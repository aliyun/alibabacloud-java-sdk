// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInPoolTransferConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallInPoolTransferConfigResponseBody body;

    public static QueryCallInPoolTransferConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInPoolTransferConfigResponse self = new QueryCallInPoolTransferConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallInPoolTransferConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallInPoolTransferConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallInPoolTransferConfigResponse setBody(QueryCallInPoolTransferConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallInPoolTransferConfigResponseBody getBody() {
        return this.body;
    }

}
