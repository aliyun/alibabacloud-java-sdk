// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAppsAuthoritiesResponseBody body;

    public static SetAppsAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppsAuthoritiesResponse self = new SetAppsAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public SetAppsAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppsAuthoritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAppsAuthoritiesResponse setBody(SetAppsAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppsAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
