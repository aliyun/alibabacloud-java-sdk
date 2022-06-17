// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCardSmsTemplateResponseBody body;

    public static QueryCardSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateResponse self = new QueryCardSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsTemplateResponse setBody(QueryCardSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
