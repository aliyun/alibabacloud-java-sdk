// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultiDimTableFieldResponseBody body;

    public static DeleteMultiDimTableFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableFieldResponse self = new DeleteMultiDimTableFieldResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultiDimTableFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultiDimTableFieldResponse setBody(DeleteMultiDimTableFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiDimTableFieldResponseBody getBody() {
        return this.body;
    }

}
