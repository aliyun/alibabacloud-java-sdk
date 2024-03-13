// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAvailableInstancesResponseBody body;

    public static QueryAvailableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesResponse self = new QueryAvailableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvailableInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvailableInstancesResponse setBody(QueryAvailableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvailableInstancesResponseBody getBody() {
        return this.body;
    }

}
