// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimStandardElevationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimStandardElevationResponseBody body;

    public static BimStandardElevationResponse build(java.util.Map<String, ?> map) throws Exception {
        BimStandardElevationResponse self = new BimStandardElevationResponse();
        return TeaModel.build(map, self);
    }

    public BimStandardElevationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimStandardElevationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimStandardElevationResponse setBody(BimStandardElevationResponseBody body) {
        this.body = body;
        return this;
    }
    public BimStandardElevationResponseBody getBody() {
        return this.body;
    }

}
