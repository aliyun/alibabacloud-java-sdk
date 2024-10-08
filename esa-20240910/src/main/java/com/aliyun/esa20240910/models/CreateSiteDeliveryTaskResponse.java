// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSiteDeliveryTaskResponseBody body;

    public static CreateSiteDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteDeliveryTaskResponse self = new CreateSiteDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSiteDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSiteDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSiteDeliveryTaskResponse setBody(CreateSiteDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSiteDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
