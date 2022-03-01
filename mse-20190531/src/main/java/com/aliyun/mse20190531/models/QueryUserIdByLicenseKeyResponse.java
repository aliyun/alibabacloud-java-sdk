// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryUserIdByLicenseKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserIdByLicenseKeyResponseBody body;

    public static QueryUserIdByLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserIdByLicenseKeyResponse self = new QueryUserIdByLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserIdByLicenseKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserIdByLicenseKeyResponse setBody(QueryUserIdByLicenseKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserIdByLicenseKeyResponseBody getBody() {
        return this.body;
    }

}
