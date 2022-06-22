// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySwitchDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySwitchDetailResponseBody body;

    public static QuerySwitchDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySwitchDetailResponse self = new QuerySwitchDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySwitchDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySwitchDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySwitchDetailResponse setBody(QuerySwitchDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySwitchDetailResponseBody getBody() {
        return this.body;
    }

}
