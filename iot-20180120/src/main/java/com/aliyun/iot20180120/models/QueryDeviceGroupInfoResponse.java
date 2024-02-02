// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceGroupInfoResponseBody body;

    public static QueryDeviceGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoResponse self = new QueryDeviceGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceGroupInfoResponse setBody(QueryDeviceGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceGroupInfoResponseBody getBody() {
        return this.body;
    }

}
