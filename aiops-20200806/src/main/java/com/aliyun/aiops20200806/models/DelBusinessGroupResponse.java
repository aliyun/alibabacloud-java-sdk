// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DelBusinessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelBusinessGroupResponseBody body;

    public static DelBusinessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DelBusinessGroupResponse self = new DelBusinessGroupResponse();
        return TeaModel.build(map, self);
    }

    public DelBusinessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelBusinessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelBusinessGroupResponse setBody(DelBusinessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DelBusinessGroupResponseBody getBody() {
        return this.body;
    }

}
