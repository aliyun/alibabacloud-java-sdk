// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLdpsComputeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLdpsComputeGroupResponseBody body;

    public static UpdateLdpsComputeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLdpsComputeGroupResponse self = new UpdateLdpsComputeGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLdpsComputeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLdpsComputeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLdpsComputeGroupResponse setBody(UpdateLdpsComputeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLdpsComputeGroupResponseBody getBody() {
        return this.body;
    }

}
