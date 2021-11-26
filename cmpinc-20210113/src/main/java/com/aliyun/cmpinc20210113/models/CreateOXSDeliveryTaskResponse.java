// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class CreateOXSDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOXSDeliveryTaskResponseBody body;

    public static CreateOXSDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOXSDeliveryTaskResponse self = new CreateOXSDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOXSDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOXSDeliveryTaskResponse setBody(CreateOXSDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOXSDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
