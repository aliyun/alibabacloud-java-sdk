// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDSEntityValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDSEntityValueResponseBody body;

    public static DeleteDSEntityValueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSEntityValueResponse self = new DeleteDSEntityValueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDSEntityValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDSEntityValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDSEntityValueResponse setBody(DeleteDSEntityValueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDSEntityValueResponseBody getBody() {
        return this.body;
    }

}
