// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteDeliveryTaskResponseBody body;

    public static GetSiteDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteDeliveryTaskResponse self = new GetSiteDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteDeliveryTaskResponse setBody(GetSiteDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
