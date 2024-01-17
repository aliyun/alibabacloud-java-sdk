// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class IsIncludedByUserWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IsIncludedByUserWhitelistResponseBody body;

    public static IsIncludedByUserWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        IsIncludedByUserWhitelistResponse self = new IsIncludedByUserWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public IsIncludedByUserWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsIncludedByUserWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsIncludedByUserWhitelistResponse setBody(IsIncludedByUserWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public IsIncludedByUserWhitelistResponseBody getBody() {
        return this.body;
    }

}
