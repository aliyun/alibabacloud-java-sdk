// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class RefreshDistrictMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshDistrictMetaResponseBody body;

    public static RefreshDistrictMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDistrictMetaResponse self = new RefreshDistrictMetaResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDistrictMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDistrictMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDistrictMetaResponse setBody(RefreshDistrictMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDistrictMetaResponseBody getBody() {
        return this.body;
    }

}
