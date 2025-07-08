// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalTemplateDetailResponseBody body;

    public static QueryDigitalTemplateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateDetailResponse self = new QueryDigitalTemplateDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalTemplateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalTemplateDetailResponse setBody(QueryDigitalTemplateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalTemplateDetailResponseBody getBody() {
        return this.body;
    }

}
