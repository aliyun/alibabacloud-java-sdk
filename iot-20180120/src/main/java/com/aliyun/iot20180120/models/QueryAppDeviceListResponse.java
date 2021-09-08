// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryAppDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppDeviceListResponseBody body;

    public static QueryAppDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppDeviceListResponse self = new QueryAppDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppDeviceListResponse setBody(QueryAppDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppDeviceListResponseBody getBody() {
        return this.body;
    }

}
