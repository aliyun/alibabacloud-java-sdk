// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateListResponseBody body;

    public static QuerySmsTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateListResponse self = new QuerySmsTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateListResponse setBody(QuerySmsTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateListResponseBody getBody() {
        return this.body;
    }

}
