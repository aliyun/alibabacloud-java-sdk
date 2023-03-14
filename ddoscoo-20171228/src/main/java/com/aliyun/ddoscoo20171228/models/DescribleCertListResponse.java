// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleCertListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribleCertListResponseBody body;

    public static DescribleCertListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribleCertListResponse self = new DescribleCertListResponse();
        return TeaModel.build(map, self);
    }

    public DescribleCertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribleCertListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribleCertListResponse setBody(DescribleCertListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribleCertListResponseBody getBody() {
        return this.body;
    }

}
