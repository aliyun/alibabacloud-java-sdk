// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindDeviceToEdgeInstanceWithDriverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody body;

    public static BatchBindDeviceToEdgeInstanceWithDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDeviceToEdgeInstanceWithDriverResponse self = new BatchBindDeviceToEdgeInstanceWithDriverResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse setBody(BatchBindDeviceToEdgeInstanceWithDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody getBody() {
        return this.body;
    }

}
