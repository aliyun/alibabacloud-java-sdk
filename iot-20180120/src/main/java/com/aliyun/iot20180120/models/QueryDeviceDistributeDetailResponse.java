// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceDistributeDetailResponseBody body;

    public static QueryDeviceDistributeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeDetailResponse self = new QueryDeviceDistributeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceDistributeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceDistributeDetailResponse setBody(QueryDeviceDistributeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceDistributeDetailResponseBody getBody() {
        return this.body;
    }

}
