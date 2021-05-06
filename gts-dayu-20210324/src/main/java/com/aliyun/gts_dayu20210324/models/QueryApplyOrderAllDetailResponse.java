// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryApplyOrderAllDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryApplyOrderAllDetailResponseBody body;

    public static QueryApplyOrderAllDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplyOrderAllDetailResponse self = new QueryApplyOrderAllDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplyOrderAllDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApplyOrderAllDetailResponse setBody(QueryApplyOrderAllDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApplyOrderAllDetailResponseBody getBody() {
        return this.body;
    }

}
