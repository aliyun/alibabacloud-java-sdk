// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewOptimizeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSQLReviewOptimizeDetailResponseBody body;

    public static GetSQLReviewOptimizeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewOptimizeDetailResponse self = new GetSQLReviewOptimizeDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewOptimizeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSQLReviewOptimizeDetailResponse setBody(GetSQLReviewOptimizeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSQLReviewOptimizeDetailResponseBody getBody() {
        return this.body;
    }

}
