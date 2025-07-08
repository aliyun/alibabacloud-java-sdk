// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsByTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStatisticsByTemplateNewResponseBody body;

    public static QuerySmsStatisticsByTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsByTemplateNewResponse self = new QuerySmsStatisticsByTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsByTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStatisticsByTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStatisticsByTemplateNewResponse setBody(QuerySmsStatisticsByTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsByTemplateNewResponseBody getBody() {
        return this.body;
    }

}
