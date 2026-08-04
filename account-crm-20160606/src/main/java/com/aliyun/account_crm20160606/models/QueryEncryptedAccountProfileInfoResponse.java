// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEncryptedAccountProfileInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEncryptedAccountProfileInfoResponseBody body;

    public static QueryEncryptedAccountProfileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEncryptedAccountProfileInfoResponse self = new QueryEncryptedAccountProfileInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEncryptedAccountProfileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEncryptedAccountProfileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEncryptedAccountProfileInfoResponse setBody(QueryEncryptedAccountProfileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEncryptedAccountProfileInfoResponseBody getBody() {
        return this.body;
    }

}
