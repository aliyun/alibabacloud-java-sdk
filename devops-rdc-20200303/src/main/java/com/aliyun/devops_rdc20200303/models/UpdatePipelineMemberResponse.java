// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdatePipelineMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePipelineMemberResponseBody body;

    public static UpdatePipelineMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineMemberResponse self = new UpdatePipelineMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineMemberResponse setBody(UpdatePipelineMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineMemberResponseBody getBody() {
        return this.body;
    }

}
