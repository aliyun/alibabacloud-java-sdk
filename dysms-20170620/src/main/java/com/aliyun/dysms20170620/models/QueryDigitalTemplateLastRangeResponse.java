// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateLastRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalTemplateLastRangeResponseBody body;

    public static QueryDigitalTemplateLastRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateLastRangeResponse self = new QueryDigitalTemplateLastRangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateLastRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalTemplateLastRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalTemplateLastRangeResponse setBody(QueryDigitalTemplateLastRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalTemplateLastRangeResponseBody getBody() {
        return this.body;
    }

}
