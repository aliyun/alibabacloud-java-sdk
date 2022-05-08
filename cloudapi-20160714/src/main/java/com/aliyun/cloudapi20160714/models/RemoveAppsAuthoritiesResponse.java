// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAppsAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAppsAuthoritiesResponseBody body;

    public static RemoveAppsAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppsAuthoritiesResponse self = new RemoveAppsAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAppsAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAppsAuthoritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAppsAuthoritiesResponse setBody(RemoveAppsAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAppsAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
