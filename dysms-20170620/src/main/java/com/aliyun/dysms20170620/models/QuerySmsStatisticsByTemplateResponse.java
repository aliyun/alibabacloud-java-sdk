// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsByTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStatisticsByTemplateResponseBody body;

    public static QuerySmsStatisticsByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsByTemplateResponse self = new QuerySmsStatisticsByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsByTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStatisticsByTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStatisticsByTemplateResponse setBody(QuerySmsStatisticsByTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsByTemplateResponseBody getBody() {
        return this.body;
    }

}
