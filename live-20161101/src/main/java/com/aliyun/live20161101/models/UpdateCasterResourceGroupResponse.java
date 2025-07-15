// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCasterResourceGroupResponseBody body;

    public static UpdateCasterResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterResourceGroupResponse self = new UpdateCasterResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasterResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCasterResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCasterResourceGroupResponse setBody(UpdateCasterResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasterResourceGroupResponseBody getBody() {
        return this.body;
    }

}
