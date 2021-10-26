// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApisAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveApisAuthoritiesResponseBody body;

    public static RemoveApisAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApisAuthoritiesResponse self = new RemoveApisAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApisAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApisAuthoritiesResponse setBody(RemoveApisAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApisAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
