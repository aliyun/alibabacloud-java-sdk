// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusNotFineOfApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStatusNotFineOfApplicationResponseBody body;

    public static QueryStatusNotFineOfApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusNotFineOfApplicationResponse self = new QueryStatusNotFineOfApplicationResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatusNotFineOfApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStatusNotFineOfApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStatusNotFineOfApplicationResponse setBody(QueryStatusNotFineOfApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStatusNotFineOfApplicationResponseBody getBody() {
        return this.body;
    }

}
