// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetSupportedResourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSupportedResourceTypesResponseBody body;

    public static GetSupportedResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedResourceTypesResponse self = new GetSupportedResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public GetSupportedResourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupportedResourceTypesResponse setBody(GetSupportedResourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupportedResourceTypesResponseBody getBody() {
        return this.body;
    }

}
