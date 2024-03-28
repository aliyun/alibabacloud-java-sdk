// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpaceUsageResponseBody body;

    public static QuerySpaceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceUsageResponse self = new QuerySpaceUsageResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpaceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpaceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpaceUsageResponse setBody(QuerySpaceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpaceUsageResponseBody getBody() {
        return this.body;
    }

}
