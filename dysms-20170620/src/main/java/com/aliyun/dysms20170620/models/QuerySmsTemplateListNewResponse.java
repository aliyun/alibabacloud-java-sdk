// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateListNewResponseBody body;

    public static QuerySmsTemplateListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateListNewResponse self = new QuerySmsTemplateListNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateListNewResponse setBody(QuerySmsTemplateListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateListNewResponseBody getBody() {
        return this.body;
    }

}
