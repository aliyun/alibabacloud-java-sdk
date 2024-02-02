// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDeviceGroupRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddDeviceGroupRelationsResponseBody body;

    public static BatchAddDeviceGroupRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDeviceGroupRelationsResponse self = new BatchAddDeviceGroupRelationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddDeviceGroupRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddDeviceGroupRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddDeviceGroupRelationsResponse setBody(BatchAddDeviceGroupRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddDeviceGroupRelationsResponseBody getBody() {
        return this.body;
    }

}
