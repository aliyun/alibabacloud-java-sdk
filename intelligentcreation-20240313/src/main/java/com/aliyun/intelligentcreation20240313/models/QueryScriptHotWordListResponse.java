// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryScriptHotWordListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryScriptHotWordListResponseBody body;

    public static QueryScriptHotWordListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptHotWordListResponse self = new QueryScriptHotWordListResponse();
        return TeaModel.build(map, self);
    }

    public QueryScriptHotWordListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScriptHotWordListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScriptHotWordListResponse setBody(QueryScriptHotWordListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScriptHotWordListResponseBody getBody() {
        return this.body;
    }

}
