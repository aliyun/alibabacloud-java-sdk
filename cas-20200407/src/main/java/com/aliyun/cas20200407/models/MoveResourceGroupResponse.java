// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class MoveResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveResourceGroupResponseBody body;

    public static MoveResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupResponse self = new MoveResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveResourceGroupResponse setBody(MoveResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveResourceGroupResponseBody getBody() {
        return this.body;
    }

}
