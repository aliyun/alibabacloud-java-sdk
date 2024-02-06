// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMdsUpgradeTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMdsUpgradeTaskDetailResponseBody body;

    public static QueryMdsUpgradeTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMdsUpgradeTaskDetailResponse self = new QueryMdsUpgradeTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMdsUpgradeTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMdsUpgradeTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMdsUpgradeTaskDetailResponse setBody(QueryMdsUpgradeTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMdsUpgradeTaskDetailResponseBody getBody() {
        return this.body;
    }

}
