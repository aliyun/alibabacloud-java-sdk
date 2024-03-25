// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenInterRegionTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCenInterRegionTrafficQosQueueResponseBody body;

    public static DeleteCenInterRegionTrafficQosQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenInterRegionTrafficQosQueueResponse self = new DeleteCenInterRegionTrafficQosQueueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenInterRegionTrafficQosQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenInterRegionTrafficQosQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCenInterRegionTrafficQosQueueResponse setBody(DeleteCenInterRegionTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenInterRegionTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
