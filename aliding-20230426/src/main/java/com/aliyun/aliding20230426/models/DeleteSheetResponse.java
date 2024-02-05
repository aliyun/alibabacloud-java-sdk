// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSheetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSheetResponseBody body;

    public static DeleteSheetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSheetResponse self = new DeleteSheetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSheetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSheetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSheetResponse setBody(DeleteSheetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSheetResponseBody getBody() {
        return this.body;
    }

}
