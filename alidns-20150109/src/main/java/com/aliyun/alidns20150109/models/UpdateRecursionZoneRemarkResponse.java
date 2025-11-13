// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionZoneRemarkResponseBody body;

    public static UpdateRecursionZoneRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneRemarkResponse self = new UpdateRecursionZoneRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionZoneRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionZoneRemarkResponse setBody(UpdateRecursionZoneRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionZoneRemarkResponseBody getBody() {
        return this.body;
    }

}
