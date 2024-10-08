// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSiteDeliveryTaskResponseBody body;

    public static DeleteSiteDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteDeliveryTaskResponse self = new DeleteSiteDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSiteDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSiteDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSiteDeliveryTaskResponse setBody(DeleteSiteDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSiteDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
