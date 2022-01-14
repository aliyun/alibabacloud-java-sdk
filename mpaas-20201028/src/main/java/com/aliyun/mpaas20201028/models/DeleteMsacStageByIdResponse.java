// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacStageByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsacStageByIdResponseBody body;

    public static DeleteMsacStageByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacStageByIdResponse self = new DeleteMsacStageByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsacStageByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsacStageByIdResponse setBody(DeleteMsacStageByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsacStageByIdResponseBody getBody() {
        return this.body;
    }

}
