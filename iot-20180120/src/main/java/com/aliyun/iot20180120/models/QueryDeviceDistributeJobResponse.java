// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceDistributeJobResponseBody body;

    public static QueryDeviceDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeJobResponse self = new QueryDeviceDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceDistributeJobResponse setBody(QueryDeviceDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

}
