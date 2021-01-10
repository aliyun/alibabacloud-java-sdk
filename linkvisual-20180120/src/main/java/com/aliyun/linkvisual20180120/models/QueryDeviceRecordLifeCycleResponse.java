// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceRecordLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceRecordLifeCycleResponseBody body;

    public static QueryDeviceRecordLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRecordLifeCycleResponse self = new QueryDeviceRecordLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRecordLifeCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceRecordLifeCycleResponse setBody(QueryDeviceRecordLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceRecordLifeCycleResponseBody getBody() {
        return this.body;
    }

}
