// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSetEdgeInstanceDeviceConfigResponseBody body;

    public static BatchSetEdgeInstanceDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetEdgeInstanceDeviceConfigResponse self = new BatchSetEdgeInstanceDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetEdgeInstanceDeviceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetEdgeInstanceDeviceConfigResponse setBody(BatchSetEdgeInstanceDeviceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

}
