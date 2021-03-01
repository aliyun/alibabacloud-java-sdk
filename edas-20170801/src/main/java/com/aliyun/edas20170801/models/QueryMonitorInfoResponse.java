// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMonitorInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMonitorInfoResponseBody body;

    public static QueryMonitorInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorInfoResponse self = new QueryMonitorInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonitorInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonitorInfoResponse setBody(QueryMonitorInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonitorInfoResponseBody getBody() {
        return this.body;
    }

}
