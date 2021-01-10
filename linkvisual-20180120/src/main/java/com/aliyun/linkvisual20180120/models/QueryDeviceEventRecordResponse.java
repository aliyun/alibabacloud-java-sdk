// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryDeviceEventRecordResponse setBody(QueryDeviceEventRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceEventRecordResponseBody getBody() {
        return this.body;
    }

}
