// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateByCodeNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateByCodeNewResponseBody body;

    public static QuerySmsTemplateByCodeNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateByCodeNewResponse self = new QuerySmsTemplateByCodeNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateByCodeNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateByCodeNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateByCodeNewResponse setBody(QuerySmsTemplateByCodeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBody getBody() {
        return this.body;
    }

}
