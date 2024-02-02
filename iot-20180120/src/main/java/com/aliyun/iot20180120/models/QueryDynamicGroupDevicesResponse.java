// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDynamicGroupDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDynamicGroupDevicesResponseBody body;

    public static QueryDynamicGroupDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDynamicGroupDevicesResponse self = new QueryDynamicGroupDevicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryDynamicGroupDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDynamicGroupDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDynamicGroupDevicesResponse setBody(QueryDynamicGroupDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDynamicGroupDevicesResponseBody getBody() {
        return this.body;
    }

}
