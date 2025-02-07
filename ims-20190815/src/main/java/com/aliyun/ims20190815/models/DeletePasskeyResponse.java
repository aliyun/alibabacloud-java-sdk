// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeletePasskeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePasskeyResponseBody body;

    public static DeletePasskeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePasskeyResponse self = new DeletePasskeyResponse();
        return TeaModel.build(map, self);
    }

    public DeletePasskeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePasskeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePasskeyResponse setBody(DeletePasskeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePasskeyResponseBody getBody() {
        return this.body;
    }

}
