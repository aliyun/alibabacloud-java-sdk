// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBatchRegisterDeviceStatusResponseBody body;

    public static QueryBatchRegisterDeviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegisterDeviceStatusResponse self = new QueryBatchRegisterDeviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegisterDeviceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBatchRegisterDeviceStatusResponse setBody(QueryBatchRegisterDeviceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBatchRegisterDeviceStatusResponseBody getBody() {
        return this.body;
    }

}
