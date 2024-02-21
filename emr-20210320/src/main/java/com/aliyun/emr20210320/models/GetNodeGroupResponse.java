// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeGroupResponseBody body;

    public static GetNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeGroupResponse self = new GetNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeGroupResponse setBody(GetNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeGroupResponseBody getBody() {
        return this.body;
    }

}
