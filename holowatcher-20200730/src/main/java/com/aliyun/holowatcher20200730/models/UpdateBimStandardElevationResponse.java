// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardElevationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBimStandardElevationResponseBody body;

    public static UpdateBimStandardElevationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardElevationResponse self = new UpdateBimStandardElevationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardElevationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBimStandardElevationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBimStandardElevationResponse setBody(UpdateBimStandardElevationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBimStandardElevationResponseBody getBody() {
        return this.body;
    }

}
