// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class LeaveClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LeaveClusterResponseBody body;

    public static LeaveClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        LeaveClusterResponse self = new LeaveClusterResponse();
        return TeaModel.build(map, self);
    }

    public LeaveClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LeaveClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LeaveClusterResponse setBody(LeaveClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public LeaveClusterResponseBody getBody() {
        return this.body;
    }

}
