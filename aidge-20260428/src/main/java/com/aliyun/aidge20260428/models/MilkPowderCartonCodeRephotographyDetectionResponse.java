// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MilkPowderCartonCodeRephotographyDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MilkPowderCartonCodeRephotographyDetectionResponseBody body;

    public static MilkPowderCartonCodeRephotographyDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        MilkPowderCartonCodeRephotographyDetectionResponse self = new MilkPowderCartonCodeRephotographyDetectionResponse();
        return TeaModel.build(map, self);
    }

    public MilkPowderCartonCodeRephotographyDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MilkPowderCartonCodeRephotographyDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MilkPowderCartonCodeRephotographyDetectionResponse setBody(MilkPowderCartonCodeRephotographyDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public MilkPowderCartonCodeRephotographyDetectionResponseBody getBody() {
        return this.body;
    }

}
