// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalEventDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceOriginalEventDataResponseBody body;

    public static QueryDeviceOriginalEventDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalEventDataResponse self = new QueryDeviceOriginalEventDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalEventDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceOriginalEventDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceOriginalEventDataResponse setBody(QueryDeviceOriginalEventDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceOriginalEventDataResponseBody getBody() {
        return this.body;
    }

}
