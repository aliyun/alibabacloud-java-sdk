// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeliveryArchVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeliveryArchVersionResponseBody body;

    public static DeleteDeliveryArchVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryArchVersionResponse self = new DeleteDeliveryArchVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryArchVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeliveryArchVersionResponse setBody(DeleteDeliveryArchVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeliveryArchVersionResponseBody getBody() {
        return this.body;
    }

}
