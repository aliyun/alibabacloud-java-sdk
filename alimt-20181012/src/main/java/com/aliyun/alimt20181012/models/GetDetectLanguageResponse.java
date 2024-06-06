// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetectLanguageResponseBody body;

    public static GetDetectLanguageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageResponse self = new GetDetectLanguageResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectLanguageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectLanguageResponse setBody(GetDetectLanguageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectLanguageResponseBody getBody() {
        return this.body;
    }

}
