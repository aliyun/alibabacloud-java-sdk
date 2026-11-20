// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretTransferDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySecretTransferDetailsResponseBody body;

    public static QuerySecretTransferDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretTransferDetailsResponse self = new QuerySecretTransferDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretTransferDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecretTransferDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySecretTransferDetailsResponse setBody(QuerySecretTransferDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecretTransferDetailsResponseBody getBody() {
        return this.body;
    }

}
