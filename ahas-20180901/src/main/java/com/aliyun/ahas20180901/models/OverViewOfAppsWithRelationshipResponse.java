// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OverViewOfAppsWithRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OverViewOfAppsWithRelationshipResponseBody body;

    public static OverViewOfAppsWithRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        OverViewOfAppsWithRelationshipResponse self = new OverViewOfAppsWithRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public OverViewOfAppsWithRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OverViewOfAppsWithRelationshipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OverViewOfAppsWithRelationshipResponse setBody(OverViewOfAppsWithRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public OverViewOfAppsWithRelationshipResponseBody getBody() {
        return this.body;
    }

}
