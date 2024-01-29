// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDSEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDSEntityResponseBody body;

    public static DeleteDSEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSEntityResponse self = new DeleteDSEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDSEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDSEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDSEntityResponse setBody(DeleteDSEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDSEntityResponseBody getBody() {
        return this.body;
    }

}
