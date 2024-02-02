// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppPageListOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStudioAppPageListOpenResponseBody body;

    public static QueryStudioAppPageListOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppPageListOpenResponse self = new QueryStudioAppPageListOpenResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppPageListOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStudioAppPageListOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStudioAppPageListOpenResponse setBody(QueryStudioAppPageListOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStudioAppPageListOpenResponseBody getBody() {
        return this.body;
    }

}
