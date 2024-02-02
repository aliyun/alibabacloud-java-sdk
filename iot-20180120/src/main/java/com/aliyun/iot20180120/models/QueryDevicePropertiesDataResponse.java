// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertiesDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicePropertiesDataResponseBody body;

    public static QueryDevicePropertiesDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertiesDataResponse self = new QueryDevicePropertiesDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertiesDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePropertiesDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicePropertiesDataResponse setBody(QueryDevicePropertiesDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePropertiesDataResponseBody getBody() {
        return this.body;
    }

}
