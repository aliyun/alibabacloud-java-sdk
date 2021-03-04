// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRIUtilizationDetailResponseBody body;

    public static QueryRIUtilizationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRIUtilizationDetailResponse self = new QueryRIUtilizationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRIUtilizationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRIUtilizationDetailResponse setBody(QueryRIUtilizationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRIUtilizationDetailResponseBody getBody() {
        return this.body;
    }

}
