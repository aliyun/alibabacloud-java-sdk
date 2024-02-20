// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class QueryTemplateByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTemplateByParamResponseBody body;

    public static QueryTemplateByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateByParamResponse self = new QueryTemplateByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTemplateByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTemplateByParamResponse setBody(QueryTemplateByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTemplateByParamResponseBody getBody() {
        return this.body;
    }

}
