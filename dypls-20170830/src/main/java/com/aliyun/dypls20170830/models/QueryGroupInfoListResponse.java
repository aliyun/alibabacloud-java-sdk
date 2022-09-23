// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryGroupInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGroupInfoListResponseBody body;

    public static QueryGroupInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupInfoListResponse self = new QueryGroupInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupInfoListResponse setBody(QueryGroupInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupInfoListResponseBody getBody() {
        return this.body;
    }

}
