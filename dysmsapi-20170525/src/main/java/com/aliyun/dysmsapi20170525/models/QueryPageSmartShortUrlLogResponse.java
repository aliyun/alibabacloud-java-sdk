// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPageSmartShortUrlLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPageSmartShortUrlLogResponseBody body;

    public static QueryPageSmartShortUrlLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPageSmartShortUrlLogResponse self = new QueryPageSmartShortUrlLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryPageSmartShortUrlLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPageSmartShortUrlLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPageSmartShortUrlLogResponse setBody(QueryPageSmartShortUrlLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPageSmartShortUrlLogResponseBody getBody() {
        return this.body;
    }

}
