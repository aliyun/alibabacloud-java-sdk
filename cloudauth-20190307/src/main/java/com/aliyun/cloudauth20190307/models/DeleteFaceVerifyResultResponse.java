// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteFaceVerifyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceVerifyResultResponseBody body;

    public static DeleteFaceVerifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceVerifyResultResponse self = new DeleteFaceVerifyResultResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceVerifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceVerifyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceVerifyResultResponse setBody(DeleteFaceVerifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceVerifyResultResponseBody getBody() {
        return this.body;
    }

}
