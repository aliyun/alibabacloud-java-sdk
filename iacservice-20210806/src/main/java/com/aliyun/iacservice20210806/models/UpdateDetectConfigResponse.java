// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateDetectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDetectConfigResponseBody body;

    public static UpdateDetectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectConfigResponse self = new UpdateDetectConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDetectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDetectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDetectConfigResponse setBody(UpdateDetectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDetectConfigResponseBody getBody() {
        return this.body;
    }

}
