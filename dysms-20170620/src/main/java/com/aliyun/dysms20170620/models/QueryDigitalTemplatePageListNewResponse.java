// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplatePageListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalTemplatePageListNewResponseBody body;

    public static QueryDigitalTemplatePageListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplatePageListNewResponse self = new QueryDigitalTemplatePageListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplatePageListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalTemplatePageListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalTemplatePageListNewResponse setBody(QueryDigitalTemplatePageListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalTemplatePageListNewResponseBody getBody() {
        return this.body;
    }

}
