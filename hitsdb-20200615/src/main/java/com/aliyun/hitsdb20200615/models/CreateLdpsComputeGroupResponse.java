// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLdpsComputeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLdpsComputeGroupResponseBody body;

    public static CreateLdpsComputeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLdpsComputeGroupResponse self = new CreateLdpsComputeGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLdpsComputeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLdpsComputeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLdpsComputeGroupResponse setBody(CreateLdpsComputeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLdpsComputeGroupResponseBody getBody() {
        return this.body;
    }

}
