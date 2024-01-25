// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetSecretByAppKeyForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetSecretByAppKeyForInnerResponseBody body;

    public static ResetSecretByAppKeyForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSecretByAppKeyForInnerResponse self = new ResetSecretByAppKeyForInnerResponse();
        return TeaModel.build(map, self);
    }

    public ResetSecretByAppKeyForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSecretByAppKeyForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetSecretByAppKeyForInnerResponse setBody(ResetSecretByAppKeyForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSecretByAppKeyForInnerResponseBody getBody() {
        return this.body;
    }

}
