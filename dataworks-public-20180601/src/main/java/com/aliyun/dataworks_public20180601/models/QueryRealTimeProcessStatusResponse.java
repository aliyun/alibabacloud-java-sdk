// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryRealTimeProcessStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRealTimeProcessStatusResponseBody body;

    public static QueryRealTimeProcessStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRealTimeProcessStatusResponse self = new QueryRealTimeProcessStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryRealTimeProcessStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRealTimeProcessStatusResponse setBody(QueryRealTimeProcessStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRealTimeProcessStatusResponseBody getBody() {
        return this.body;
    }

}
