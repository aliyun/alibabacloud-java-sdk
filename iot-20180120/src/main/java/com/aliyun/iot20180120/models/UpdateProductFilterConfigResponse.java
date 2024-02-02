// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductFilterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductFilterConfigResponseBody body;

    public static UpdateProductFilterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductFilterConfigResponse self = new UpdateProductFilterConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductFilterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductFilterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductFilterConfigResponse setBody(UpdateProductFilterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductFilterConfigResponseBody getBody() {
        return this.body;
    }

}
