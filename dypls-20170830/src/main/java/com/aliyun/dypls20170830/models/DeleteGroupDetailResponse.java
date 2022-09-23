// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class DeleteGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGroupDetailResponseBody body;

    public static DeleteGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupDetailResponse self = new DeleteGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupDetailResponse setBody(DeleteGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupDetailResponseBody getBody() {
        return this.body;
    }

}
