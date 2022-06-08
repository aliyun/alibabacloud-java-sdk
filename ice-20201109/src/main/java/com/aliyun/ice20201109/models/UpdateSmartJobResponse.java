// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSmartJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartJobResponseBody body;

    public static UpdateSmartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartJobResponse self = new UpdateSmartJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartJobResponse setBody(UpdateSmartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartJobResponseBody getBody() {
        return this.body;
    }

}
