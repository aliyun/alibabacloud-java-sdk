// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceInspectionsResponseBody body;

    public static GetInstanceInspectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionsResponse self = new GetInstanceInspectionsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInspectionsResponse setBody(GetInstanceInspectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInspectionsResponseBody getBody() {
        return this.body;
    }

}
