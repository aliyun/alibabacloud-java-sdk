// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhysicalDatabaseResponseBody body;

    public static GetPhysicalDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalDatabaseResponse self = new GetPhysicalDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalDatabaseResponse setBody(GetPhysicalDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalDatabaseResponseBody getBody() {
        return this.body;
    }

}
