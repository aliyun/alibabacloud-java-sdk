// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagInfoBySelectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagInfoBySelectionResponseBody body;

    public static QueryTagInfoBySelectionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagInfoBySelectionResponse self = new QueryTagInfoBySelectionResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagInfoBySelectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagInfoBySelectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagInfoBySelectionResponse setBody(QueryTagInfoBySelectionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagInfoBySelectionResponseBody getBody() {
        return this.body;
    }

}
