// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerUserAlarmThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResellerUserAlarmThresholdResponseBody body;

    public static QueryResellerUserAlarmThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerUserAlarmThresholdResponse self = new QueryResellerUserAlarmThresholdResponse();
        return TeaModel.build(map, self);
    }

    public QueryResellerUserAlarmThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResellerUserAlarmThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResellerUserAlarmThresholdResponse setBody(QueryResellerUserAlarmThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResellerUserAlarmThresholdResponseBody getBody() {
        return this.body;
    }

}
