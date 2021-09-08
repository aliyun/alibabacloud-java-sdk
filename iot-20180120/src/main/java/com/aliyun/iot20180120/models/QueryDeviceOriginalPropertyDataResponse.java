// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceOriginalPropertyDataResponseBody body;

    public static QueryDeviceOriginalPropertyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyDataResponse self = new QueryDeviceOriginalPropertyDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceOriginalPropertyDataResponse setBody(QueryDeviceOriginalPropertyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceOriginalPropertyDataResponseBody getBody() {
        return this.body;
    }

}
