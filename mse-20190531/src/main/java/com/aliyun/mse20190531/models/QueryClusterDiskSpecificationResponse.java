// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDiskSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryClusterDiskSpecificationResponseBody body;

    public static QueryClusterDiskSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDiskSpecificationResponse self = new QueryClusterDiskSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterDiskSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterDiskSpecificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryClusterDiskSpecificationResponse setBody(QueryClusterDiskSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterDiskSpecificationResponseBody getBody() {
        return this.body;
    }

}
