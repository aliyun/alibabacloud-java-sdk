// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class UpdateAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppVersionResponseBody body;

    public static UpdateAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionResponse self = new UpdateAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppVersionResponse setBody(UpdateAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppVersionResponseBody getBody() {
        return this.body;
    }

}
