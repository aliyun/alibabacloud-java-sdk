// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeliveryProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeliveryProjectResponseBody body;

    public static DeleteDeliveryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryProjectResponse self = new DeleteDeliveryProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeliveryProjectResponse setBody(DeleteDeliveryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeliveryProjectResponseBody getBody() {
        return this.body;
    }

}
