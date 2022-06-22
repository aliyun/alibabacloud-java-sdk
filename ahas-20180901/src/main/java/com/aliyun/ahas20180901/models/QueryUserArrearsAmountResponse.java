// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryUserArrearsAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserArrearsAmountResponseBody body;

    public static QueryUserArrearsAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserArrearsAmountResponse self = new QueryUserArrearsAmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserArrearsAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserArrearsAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserArrearsAmountResponse setBody(QueryUserArrearsAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserArrearsAmountResponseBody getBody() {
        return this.body;
    }

}
