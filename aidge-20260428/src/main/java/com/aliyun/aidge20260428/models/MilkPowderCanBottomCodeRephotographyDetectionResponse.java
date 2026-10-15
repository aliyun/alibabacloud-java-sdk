// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MilkPowderCanBottomCodeRephotographyDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody body;

    public static MilkPowderCanBottomCodeRephotographyDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        MilkPowderCanBottomCodeRephotographyDetectionResponse self = new MilkPowderCanBottomCodeRephotographyDetectionResponse();
        return TeaModel.build(map, self);
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponse setBody(MilkPowderCanBottomCodeRephotographyDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody getBody() {
        return this.body;
    }

}
