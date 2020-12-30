// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardHistoryFlowInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCardHistoryFlowInfoResponseBody body;

    public static QueryCardHistoryFlowInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardHistoryFlowInfoResponse self = new QueryCardHistoryFlowInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardHistoryFlowInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardHistoryFlowInfoResponse setBody(QueryCardHistoryFlowInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardHistoryFlowInfoResponseBody getBody() {
        return this.body;
    }

}
