// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppImageStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppImageStatusResponseBody body;

    public static GetAppImageStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppImageStatusResponse self = new GetAppImageStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAppImageStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppImageStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppImageStatusResponse setBody(GetAppImageStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppImageStatusResponseBody getBody() {
        return this.body;
    }

}
