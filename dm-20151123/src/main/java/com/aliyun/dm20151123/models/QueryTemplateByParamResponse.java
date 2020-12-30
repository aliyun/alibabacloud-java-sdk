// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTemplateByParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryTemplateByParamResponse setBody(QueryTemplateByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTemplateByParamResponseBody getBody() {
        return this.body;
    }

}
