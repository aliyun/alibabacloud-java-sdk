// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceEventRecordResponseBody body;

    public static QueryDeviceEventRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventRecordResponse self = new QueryDeviceEventRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceEventRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceEventRecordResponse setBody(QueryDeviceEventRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceEventRecordResponseBody getBody() {
        return this.body;
    }

}
