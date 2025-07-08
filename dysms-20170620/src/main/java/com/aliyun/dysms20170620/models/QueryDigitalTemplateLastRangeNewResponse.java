// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateLastRangeNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalTemplateLastRangeNewResponseBody body;

    public static QueryDigitalTemplateLastRangeNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateLastRangeNewResponse self = new QueryDigitalTemplateLastRangeNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateLastRangeNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalTemplateLastRangeNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalTemplateLastRangeNewResponse setBody(QueryDigitalTemplateLastRangeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalTemplateLastRangeNewResponseBody getBody() {
        return this.body;
    }

}
