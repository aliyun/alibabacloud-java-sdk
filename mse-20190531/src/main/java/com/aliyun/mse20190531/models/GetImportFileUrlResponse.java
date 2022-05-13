// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetImportFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetImportFileUrlResponseBody body;

    public static GetImportFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImportFileUrlResponse self = new GetImportFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetImportFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImportFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImportFileUrlResponse setBody(GetImportFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImportFileUrlResponseBody getBody() {
        return this.body;
    }

}
