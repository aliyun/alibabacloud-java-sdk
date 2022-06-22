// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNoticeResponseBody body;

    public static QueryNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNoticeResponse self = new QueryNoticeResponse();
        return TeaModel.build(map, self);
    }

    public QueryNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNoticeResponse setBody(QueryNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNoticeResponseBody getBody() {
        return this.body;
    }

}
