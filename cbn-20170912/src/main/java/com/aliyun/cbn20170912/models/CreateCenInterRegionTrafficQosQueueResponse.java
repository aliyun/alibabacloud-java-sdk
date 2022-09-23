// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCenInterRegionTrafficQosQueueResponseBody body;

    public static CreateCenInterRegionTrafficQosQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosQueueResponse self = new CreateCenInterRegionTrafficQosQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenInterRegionTrafficQosQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenInterRegionTrafficQosQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCenInterRegionTrafficQosQueueResponse setBody(CreateCenInterRegionTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenInterRegionTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
