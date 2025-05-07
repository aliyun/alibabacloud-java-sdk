// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnExtensionBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAxnExtensionBindFixedLineResponseBody body;

    public static QueryAxnExtensionBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAxnExtensionBindFixedLineResponse self = new QueryAxnExtensionBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public QueryAxnExtensionBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAxnExtensionBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAxnExtensionBindFixedLineResponse setBody(QueryAxnExtensionBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAxnExtensionBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
