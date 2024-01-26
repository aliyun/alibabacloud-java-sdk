// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ClonePolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClonePolicyGroupResponseBody body;

    public static ClonePolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ClonePolicyGroupResponse self = new ClonePolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ClonePolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClonePolicyGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClonePolicyGroupResponse setBody(ClonePolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ClonePolicyGroupResponseBody getBody() {
        return this.body;
    }

}
