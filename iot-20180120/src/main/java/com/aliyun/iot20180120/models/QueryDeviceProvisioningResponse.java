// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceProvisioningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceProvisioningResponseBody body;

    public static QueryDeviceProvisioningResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceProvisioningResponse self = new QueryDeviceProvisioningResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceProvisioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceProvisioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceProvisioningResponse setBody(QueryDeviceProvisioningResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceProvisioningResponseBody getBody() {
        return this.body;
    }

}
