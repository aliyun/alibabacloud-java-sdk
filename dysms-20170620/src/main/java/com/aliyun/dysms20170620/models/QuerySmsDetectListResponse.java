// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsDetectListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsDetectListResponseBody body;

    public static QuerySmsDetectListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDetectListResponse self = new QuerySmsDetectListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsDetectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsDetectListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsDetectListResponse setBody(QuerySmsDetectListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsDetectListResponseBody getBody() {
        return this.body;
    }

}
