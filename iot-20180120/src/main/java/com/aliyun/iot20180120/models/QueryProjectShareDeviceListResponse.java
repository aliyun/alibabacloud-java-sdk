// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProjectShareDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectShareDeviceListResponseBody body;

    public static QueryProjectShareDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectShareDeviceListResponse self = new QueryProjectShareDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectShareDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectShareDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectShareDeviceListResponse setBody(QueryProjectShareDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectShareDeviceListResponseBody getBody() {
        return this.body;
    }

}
