// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateByCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateByCodeResponseBody body;

    public static QuerySmsTemplateByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateByCodeResponse self = new QuerySmsTemplateByCodeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateByCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateByCodeResponse setBody(QuerySmsTemplateByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateByCodeResponseBody getBody() {
        return this.body;
    }

}
