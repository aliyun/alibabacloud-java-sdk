// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCopyrightExtractJobResponseBody body;

    public static QueryCopyrightExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractJobResponse self = new QueryCopyrightExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCopyrightExtractJobResponse setBody(QueryCopyrightExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightExtractJobResponseBody getBody() {
        return this.body;
    }

}
