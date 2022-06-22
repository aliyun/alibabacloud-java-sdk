// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParamHotKeysResponseBody body;

    public static QueryParamHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParamHotKeysResponse self = new QueryParamHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public QueryParamHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParamHotKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParamHotKeysResponse setBody(QueryParamHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParamHotKeysResponseBody getBody() {
        return this.body;
    }

}
