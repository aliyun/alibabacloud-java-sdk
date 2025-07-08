// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryAnyParamTemplateUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAnyParamTemplateUserResponseBody body;

    public static QueryAnyParamTemplateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAnyParamTemplateUserResponse self = new QueryAnyParamTemplateUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryAnyParamTemplateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAnyParamTemplateUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAnyParamTemplateUserResponse setBody(QueryAnyParamTemplateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAnyParamTemplateUserResponseBody getBody() {
        return this.body;
    }

}
