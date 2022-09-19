// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFullTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSparkTemplateFullTreeResponseBody body;

    public static GetSparkTemplateFullTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFullTreeResponse self = new GetSparkTemplateFullTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFullTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkTemplateFullTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkTemplateFullTreeResponse setBody(GetSparkTemplateFullTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkTemplateFullTreeResponseBody getBody() {
        return this.body;
    }

}
