// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductFilterConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateProductFilterConfigResponse setBody(UpdateProductFilterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductFilterConfigResponseBody getBody() {
        return this.body;
    }

}
