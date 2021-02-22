// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentVehicleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentVehicleResponseBody body;

    public static SegmentVehicleResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentVehicleResponse self = new SegmentVehicleResponse();
        return TeaModel.build(map, self);
    }

    public SegmentVehicleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentVehicleResponse setBody(SegmentVehicleResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentVehicleResponseBody getBody() {
        return this.body;
    }

}
