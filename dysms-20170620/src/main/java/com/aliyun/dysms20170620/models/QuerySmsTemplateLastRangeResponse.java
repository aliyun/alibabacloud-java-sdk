// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateLastRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTemplateLastRangeResponseBody body;

    public static QuerySmsTemplateLastRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateLastRangeResponse self = new QuerySmsTemplateLastRangeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateLastRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTemplateLastRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTemplateLastRangeResponse setBody(QuerySmsTemplateLastRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTemplateLastRangeResponseBody getBody() {
        return this.body;
    }

}
