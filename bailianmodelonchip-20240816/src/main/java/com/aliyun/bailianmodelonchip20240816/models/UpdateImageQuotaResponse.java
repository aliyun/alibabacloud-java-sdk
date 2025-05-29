// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class UpdateImageQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageQuotaResponseBody body;

    public static UpdateImageQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageQuotaResponse self = new UpdateImageQuotaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageQuotaResponse setBody(UpdateImageQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageQuotaResponseBody getBody() {
        return this.body;
    }

}
