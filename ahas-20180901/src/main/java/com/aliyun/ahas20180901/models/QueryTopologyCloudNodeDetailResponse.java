// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyCloudNodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyCloudNodeDetailResponseBody body;

    public static QueryTopologyCloudNodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyCloudNodeDetailResponse self = new QueryTopologyCloudNodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyCloudNodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyCloudNodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyCloudNodeDetailResponse setBody(QueryTopologyCloudNodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyCloudNodeDetailResponseBody getBody() {
        return this.body;
    }

}
