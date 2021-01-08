// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeletePipelineMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePipelineMemberResponseBody body;

    public static DeletePipelineMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineMemberResponse self = new DeletePipelineMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineMemberResponse setBody(DeletePipelineMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineMemberResponseBody getBody() {
        return this.body;
    }

}
