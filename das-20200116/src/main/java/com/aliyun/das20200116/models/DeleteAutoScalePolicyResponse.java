// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteAutoScalePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAutoScalePolicyResponseBody body;

    public static DeleteAutoScalePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalePolicyResponse self = new DeleteAutoScalePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoScalePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoScalePolicyResponse setBody(DeleteAutoScalePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoScalePolicyResponseBody getBody() {
        return this.body;
    }

}
