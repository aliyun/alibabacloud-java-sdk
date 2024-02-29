// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetaCategoryResponseBody body;

    public static DeleteMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCategoryResponse self = new DeleteMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetaCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetaCategoryResponse setBody(DeleteMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
