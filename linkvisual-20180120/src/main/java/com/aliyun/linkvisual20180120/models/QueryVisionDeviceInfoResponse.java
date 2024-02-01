// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVisionDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVisionDeviceInfoResponseBody body;

    public static QueryVisionDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVisionDeviceInfoResponse self = new QueryVisionDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryVisionDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVisionDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVisionDeviceInfoResponse setBody(QueryVisionDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVisionDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
