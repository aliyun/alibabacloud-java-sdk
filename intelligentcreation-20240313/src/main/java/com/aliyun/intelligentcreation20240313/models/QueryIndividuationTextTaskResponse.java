// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryIndividuationTextTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIndividuationTextTaskResponseBody body;

    public static QueryIndividuationTextTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividuationTextTaskResponse self = new QueryIndividuationTextTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndividuationTextTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIndividuationTextTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIndividuationTextTaskResponse setBody(QueryIndividuationTextTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIndividuationTextTaskResponseBody getBody() {
        return this.body;
    }

}
