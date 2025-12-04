// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVmsVirtualNumberRelationByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVmsVirtualNumberRelationByPageResponseBody body;

    public static QueryVmsVirtualNumberRelationByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVmsVirtualNumberRelationByPageResponse self = new QueryVmsVirtualNumberRelationByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryVmsVirtualNumberRelationByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVmsVirtualNumberRelationByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVmsVirtualNumberRelationByPageResponse setBody(QueryVmsVirtualNumberRelationByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVmsVirtualNumberRelationByPageResponseBody getBody() {
        return this.body;
    }

}
