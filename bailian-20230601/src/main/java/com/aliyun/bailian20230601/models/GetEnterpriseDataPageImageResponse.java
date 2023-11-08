// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataPageImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnterpriseDataPageImageResponseBody body;

    public static GetEnterpriseDataPageImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataPageImageResponse self = new GetEnterpriseDataPageImageResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataPageImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDataPageImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDataPageImageResponse setBody(GetEnterpriseDataPageImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDataPageImageResponseBody getBody() {
        return this.body;
    }

}
