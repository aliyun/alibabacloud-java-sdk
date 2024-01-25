// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApisAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApisAuthoritiesResponseBody body;

    public static SetApisAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApisAuthoritiesResponse self = new SetApisAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public SetApisAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApisAuthoritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApisAuthoritiesResponse setBody(SetApisAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApisAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
