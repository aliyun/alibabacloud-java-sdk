// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteDeliveryTaskResponseBody body;

    public static UpdateSiteDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteDeliveryTaskResponse self = new UpdateSiteDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteDeliveryTaskResponse setBody(UpdateSiteDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
