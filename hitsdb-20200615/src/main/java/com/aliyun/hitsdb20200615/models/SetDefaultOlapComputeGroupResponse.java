// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class SetDefaultOlapComputeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultOlapComputeGroupResponseBody body;

    public static SetDefaultOlapComputeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultOlapComputeGroupResponse self = new SetDefaultOlapComputeGroupResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultOlapComputeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultOlapComputeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultOlapComputeGroupResponse setBody(SetDefaultOlapComputeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultOlapComputeGroupResponseBody getBody() {
        return this.body;
    }

}
