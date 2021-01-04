// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFacesResponseBody body;

    public static GetFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFacesResponse self = new GetFacesResponse();
        return TeaModel.build(map, self);
    }

    public GetFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFacesResponse setBody(GetFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFacesResponseBody getBody() {
        return this.body;
    }

}
