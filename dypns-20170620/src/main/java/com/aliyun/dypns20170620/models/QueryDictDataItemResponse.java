// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryDictDataItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDictDataItemResponseBody body;

    public static QueryDictDataItemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDictDataItemResponse self = new QueryDictDataItemResponse();
        return TeaModel.build(map, self);
    }

    public QueryDictDataItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDictDataItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDictDataItemResponse setBody(QueryDictDataItemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDictDataItemResponseBody getBody() {
        return this.body;
    }

}
