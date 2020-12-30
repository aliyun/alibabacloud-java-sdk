// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryAlarmHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAlarmHistoryResponseBody body;

    public static QueryAlarmHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmHistoryResponse self = new QueryAlarmHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAlarmHistoryResponse setBody(QueryAlarmHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAlarmHistoryResponseBody getBody() {
        return this.body;
    }

}
