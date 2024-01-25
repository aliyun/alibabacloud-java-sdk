// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class QueryTemplateListByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTemplateListByGroupIdResponseBody body;

    public static QueryTemplateListByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateListByGroupIdResponse self = new QueryTemplateListByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateListByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTemplateListByGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTemplateListByGroupIdResponse setBody(QueryTemplateListByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTemplateListByGroupIdResponseBody getBody() {
        return this.body;
    }

}
