// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceOriginalServiceDataResponseBody body;

    public static QueryDeviceOriginalServiceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalServiceDataResponse self = new QueryDeviceOriginalServiceDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalServiceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceOriginalServiceDataResponse setBody(QueryDeviceOriginalServiceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceOriginalServiceDataResponseBody getBody() {
        return this.body;
    }

}
