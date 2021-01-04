// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeleteTransmitLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTransmitLineResponseBody body;

    public static DeleteTransmitLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransmitLineResponse self = new DeleteTransmitLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransmitLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransmitLineResponse setBody(DeleteTransmitLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransmitLineResponseBody getBody() {
        return this.body;
    }

}
