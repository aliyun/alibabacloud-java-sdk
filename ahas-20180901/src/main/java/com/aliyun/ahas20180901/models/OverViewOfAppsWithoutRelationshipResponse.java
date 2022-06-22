// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OverViewOfAppsWithoutRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OverViewOfAppsWithoutRelationshipResponseBody body;

    public static OverViewOfAppsWithoutRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        OverViewOfAppsWithoutRelationshipResponse self = new OverViewOfAppsWithoutRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public OverViewOfAppsWithoutRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OverViewOfAppsWithoutRelationshipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OverViewOfAppsWithoutRelationshipResponse setBody(OverViewOfAppsWithoutRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public OverViewOfAppsWithoutRelationshipResponseBody getBody() {
        return this.body;
    }

}
