// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateCommonGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCommonGroupResponseBody body;

    public static UpdateCommonGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommonGroupResponse self = new UpdateCommonGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommonGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommonGroupResponse setBody(UpdateCommonGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommonGroupResponseBody getBody() {
        return this.body;
    }

}
