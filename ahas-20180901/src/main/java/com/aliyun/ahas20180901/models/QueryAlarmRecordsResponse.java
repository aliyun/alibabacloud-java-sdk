// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAlarmRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAlarmRecordsResponseBody body;

    public static QueryAlarmRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmRecordsResponse self = new QueryAlarmRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAlarmRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAlarmRecordsResponse setBody(QueryAlarmRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAlarmRecordsResponseBody getBody() {
        return this.body;
    }

}
