// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class GetRootBusinessLocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRootBusinessLocationsResponseBody body;

    public static GetRootBusinessLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRootBusinessLocationsResponse self = new GetRootBusinessLocationsResponse();
        return TeaModel.build(map, self);
    }

    public GetRootBusinessLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRootBusinessLocationsResponse setBody(GetRootBusinessLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRootBusinessLocationsResponseBody getBody() {
        return this.body;
    }

}
