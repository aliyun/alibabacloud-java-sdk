// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySuperDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySuperDeviceGroupResponseBody body;

    public static QuerySuperDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySuperDeviceGroupResponse self = new QuerySuperDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QuerySuperDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySuperDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySuperDeviceGroupResponse setBody(QuerySuperDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySuperDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
