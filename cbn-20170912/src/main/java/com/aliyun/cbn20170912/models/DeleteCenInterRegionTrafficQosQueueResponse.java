// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenInterRegionTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteCenInterRegionTrafficQosQueueResponse setBody(DeleteCenInterRegionTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenInterRegionTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
