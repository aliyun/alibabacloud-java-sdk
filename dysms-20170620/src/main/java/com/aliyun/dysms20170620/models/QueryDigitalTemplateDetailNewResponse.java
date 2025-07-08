// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateDetailNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalTemplateDetailNewResponseBody body;

    public static QueryDigitalTemplateDetailNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateDetailNewResponse self = new QueryDigitalTemplateDetailNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateDetailNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalTemplateDetailNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalTemplateDetailNewResponse setBody(QueryDigitalTemplateDetailNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalTemplateDetailNewResponseBody getBody() {
        return this.body;
    }

}
