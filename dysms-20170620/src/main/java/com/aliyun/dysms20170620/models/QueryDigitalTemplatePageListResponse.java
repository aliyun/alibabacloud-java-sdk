// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplatePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalTemplatePageListResponseBody body;

    public static QueryDigitalTemplatePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplatePageListResponse self = new QueryDigitalTemplatePageListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplatePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalTemplatePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalTemplatePageListResponse setBody(QueryDigitalTemplatePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalTemplatePageListResponseBody getBody() {
        return this.body;
    }

}
