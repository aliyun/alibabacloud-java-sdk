// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GenerateDeviceByBatchIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDeviceByBatchIdResponseBody body;

    public static GenerateDeviceByBatchIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceByBatchIdResponse self = new GenerateDeviceByBatchIdResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceByBatchIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDeviceByBatchIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDeviceByBatchIdResponse setBody(GenerateDeviceByBatchIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDeviceByBatchIdResponseBody getBody() {
        return this.body;
    }

}
