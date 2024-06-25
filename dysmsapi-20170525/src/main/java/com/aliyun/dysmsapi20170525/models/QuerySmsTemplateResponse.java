// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateResponseBody body;

    public static QuerySmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateResponse self = new QuerySmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateResponse setBody(QuerySmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateResponseBody getBody() {
        return this.body;
    }

}
