// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetAppsAuthoritiesResponse setBody(SetAppsAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppsAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
