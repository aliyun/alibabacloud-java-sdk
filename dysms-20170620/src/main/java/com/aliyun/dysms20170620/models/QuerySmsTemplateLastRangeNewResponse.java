// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateLastRangeNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateLastRangeNewResponseBody body;

    public static QuerySmsTemplateLastRangeNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateLastRangeNewResponse self = new QuerySmsTemplateLastRangeNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateLastRangeNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateLastRangeNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateLastRangeNewResponse setBody(QuerySmsTemplateLastRangeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateLastRangeNewResponseBody getBody() {
        return this.body;
    }

}
