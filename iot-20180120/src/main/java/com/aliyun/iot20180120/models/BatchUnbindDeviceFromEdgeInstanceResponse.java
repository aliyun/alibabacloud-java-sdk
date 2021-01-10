// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindDeviceFromEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindDeviceFromEdgeInstanceResponseBody body;

    public static BatchUnbindDeviceFromEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindDeviceFromEdgeInstanceResponse self = new BatchUnbindDeviceFromEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse setBody(BatchUnbindDeviceFromEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindDeviceFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
