// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListStatsEventRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStatsEventRecordsResponseBody body;

    public static ListStatsEventRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatsEventRecordsResponse self = new ListStatsEventRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListStatsEventRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStatsEventRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStatsEventRecordsResponse setBody(ListStatsEventRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatsEventRecordsResponseBody getBody() {
        return this.body;
    }

}
