// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWatermarkResponseBody body;

    public static UpdateWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkResponse self = new UpdateWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWatermarkResponse setBody(UpdateWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWatermarkResponseBody getBody() {
        return this.body;
    }

}
