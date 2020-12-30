// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverByParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryReceiverByParamResponseBody body;

    public static QueryReceiverByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverByParamResponse self = new QueryReceiverByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryReceiverByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReceiverByParamResponse setBody(QueryReceiverByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReceiverByParamResponseBody getBody() {
        return this.body;
    }

}
