// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessGroupResponseBody body;

    public static GetBusinessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupResponse self = new GetBusinessGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessGroupResponse setBody(GetBusinessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessGroupResponseBody getBody() {
        return this.body;
    }

}
