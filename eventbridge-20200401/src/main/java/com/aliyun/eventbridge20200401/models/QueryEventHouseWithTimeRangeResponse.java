// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventHouseWithTimeRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventHouseWithTimeRangeResponseBody body;

    public static QueryEventHouseWithTimeRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventHouseWithTimeRangeResponse self = new QueryEventHouseWithTimeRangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventHouseWithTimeRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventHouseWithTimeRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventHouseWithTimeRangeResponse setBody(QueryEventHouseWithTimeRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventHouseWithTimeRangeResponseBody getBody() {
        return this.body;
    }

}
