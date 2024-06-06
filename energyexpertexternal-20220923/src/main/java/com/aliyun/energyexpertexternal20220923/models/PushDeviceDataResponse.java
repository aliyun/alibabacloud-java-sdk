// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushDeviceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushDeviceDataResponseBody body;

    public static PushDeviceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceDataResponse self = new PushDeviceDataResponse();
        return TeaModel.build(map, self);
    }

    public PushDeviceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDeviceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushDeviceDataResponse setBody(PushDeviceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDeviceDataResponseBody getBody() {
        return this.body;
    }

}
