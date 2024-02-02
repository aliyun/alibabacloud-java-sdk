// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceListByDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceListByDeviceGroupResponseBody body;

    public static QueryDeviceListByDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceListByDeviceGroupResponse self = new QueryDeviceListByDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceListByDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceListByDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceListByDeviceGroupResponse setBody(QueryDeviceListByDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceListByDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
