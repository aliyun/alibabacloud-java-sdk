// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacStageInstanceByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsacStageInstanceByIdResponseBody body;

    public static DeleteMsacStageInstanceByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacStageInstanceByIdResponse self = new DeleteMsacStageInstanceByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsacStageInstanceByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsacStageInstanceByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMsacStageInstanceByIdResponse setBody(DeleteMsacStageInstanceByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsacStageInstanceByIdResponseBody getBody() {
        return this.body;
    }

}
