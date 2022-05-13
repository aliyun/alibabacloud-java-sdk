// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowCategoryResponseBody body;

    public static DeleteFlowCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowCategoryResponse self = new DeleteFlowCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowCategoryResponse setBody(DeleteFlowCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowCategoryResponseBody getBody() {
        return this.body;
    }

}
