// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthToApiProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppsAuthToApiProductResponseBody body;

    public static SetAppsAuthToApiProductResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppsAuthToApiProductResponse self = new SetAppsAuthToApiProductResponse();
        return TeaModel.build(map, self);
    }

    public SetAppsAuthToApiProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppsAuthToApiProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAppsAuthToApiProductResponse setBody(SetAppsAuthToApiProductResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppsAuthToApiProductResponseBody getBody() {
        return this.body;
    }

}
