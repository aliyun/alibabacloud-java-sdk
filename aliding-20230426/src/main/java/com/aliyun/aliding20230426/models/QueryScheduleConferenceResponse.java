// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryScheduleConferenceResponseBody body;

    public static QueryScheduleConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceResponse self = new QueryScheduleConferenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScheduleConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScheduleConferenceResponse setBody(QueryScheduleConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScheduleConferenceResponseBody getBody() {
        return this.body;
    }

}
