// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMdsUpgradeTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryMdsUpgradeTaskDetailResponse setBody(QueryMdsUpgradeTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMdsUpgradeTaskDetailResponseBody getBody() {
        return this.body;
    }

}
