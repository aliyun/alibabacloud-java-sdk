// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageDiagnoseResponseBody body;

    public static GetImageDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageDiagnoseResponse self = new GetImageDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public GetImageDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageDiagnoseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageDiagnoseResponse setBody(GetImageDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageDiagnoseResponseBody getBody() {
        return this.body;
    }

}
