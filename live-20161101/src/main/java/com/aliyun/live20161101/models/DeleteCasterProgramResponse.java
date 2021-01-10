// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterProgramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCasterProgramResponseBody body;

    public static DeleteCasterProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterProgramResponse self = new DeleteCasterProgramResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterProgramResponse setBody(DeleteCasterProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterProgramResponseBody getBody() {
        return this.body;
    }

}
