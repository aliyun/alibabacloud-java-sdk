// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosQueueAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCenInterRegionTrafficQosQueueAttributeResponseBody body;

    public static UpdateCenInterRegionTrafficQosQueueAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCenInterRegionTrafficQosQueueAttributeResponse self = new UpdateCenInterRegionTrafficQosQueueAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeResponse setBody(UpdateCenInterRegionTrafficQosQueueAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCenInterRegionTrafficQosQueueAttributeResponseBody getBody() {
        return this.body;
    }

}
