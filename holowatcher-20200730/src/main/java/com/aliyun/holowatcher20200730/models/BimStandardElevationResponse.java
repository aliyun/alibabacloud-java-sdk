// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimStandardElevationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public BimStandardElevationResponse setBody(BimStandardElevationResponseBody body) {
        this.body = body;
        return this;
    }
    public BimStandardElevationResponseBody getBody() {
        return this.body;
    }

}
