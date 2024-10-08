// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteDeliveryTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteDeliveryTaskStatusResponseBody body;

    public static UpdateSiteDeliveryTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteDeliveryTaskStatusResponse self = new UpdateSiteDeliveryTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteDeliveryTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteDeliveryTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteDeliveryTaskStatusResponse setBody(UpdateSiteDeliveryTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteDeliveryTaskStatusResponseBody getBody() {
        return this.body;
    }

}
