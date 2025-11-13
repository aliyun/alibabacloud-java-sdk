// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneEffectiveScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionZoneEffectiveScopeResponseBody body;

    public static UpdateRecursionZoneEffectiveScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneEffectiveScopeResponse self = new UpdateRecursionZoneEffectiveScopeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneEffectiveScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionZoneEffectiveScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionZoneEffectiveScopeResponse setBody(UpdateRecursionZoneEffectiveScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionZoneEffectiveScopeResponseBody getBody() {
        return this.body;
    }

}
