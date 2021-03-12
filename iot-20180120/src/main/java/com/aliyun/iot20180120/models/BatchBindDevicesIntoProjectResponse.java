// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindDevicesIntoProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchBindDevicesIntoProjectResponseBody body;

    public static BatchBindDevicesIntoProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDevicesIntoProjectResponse self = new BatchBindDevicesIntoProjectResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindDevicesIntoProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindDevicesIntoProjectResponse setBody(BatchBindDevicesIntoProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindDevicesIntoProjectResponseBody getBody() {
        return this.body;
    }

}
