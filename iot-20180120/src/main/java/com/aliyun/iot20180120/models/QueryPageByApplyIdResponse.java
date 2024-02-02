// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryPageByApplyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPageByApplyIdResponseBody body;

    public static QueryPageByApplyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPageByApplyIdResponse self = new QueryPageByApplyIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryPageByApplyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPageByApplyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPageByApplyIdResponse setBody(QueryPageByApplyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPageByApplyIdResponseBody getBody() {
        return this.body;
    }

}
