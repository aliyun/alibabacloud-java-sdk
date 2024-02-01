// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BatchQueryVisionDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchQueryVisionDeviceInfoResponseBody body;

    public static BatchQueryVisionDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryVisionDeviceInfoResponse self = new BatchQueryVisionDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryVisionDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryVisionDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryVisionDeviceInfoResponse setBody(BatchQueryVisionDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryVisionDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
