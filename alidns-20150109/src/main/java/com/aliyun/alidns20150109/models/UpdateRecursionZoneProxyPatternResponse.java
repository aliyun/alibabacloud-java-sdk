// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneProxyPatternResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionZoneProxyPatternResponseBody body;

    public static UpdateRecursionZoneProxyPatternResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneProxyPatternResponse self = new UpdateRecursionZoneProxyPatternResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneProxyPatternResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionZoneProxyPatternResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionZoneProxyPatternResponse setBody(UpdateRecursionZoneProxyPatternResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionZoneProxyPatternResponseBody getBody() {
        return this.body;
    }

}
