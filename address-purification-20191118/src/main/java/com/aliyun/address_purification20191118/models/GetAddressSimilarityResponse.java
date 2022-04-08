// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetAddressSimilarityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAddressSimilarityResponseBody body;

    public static GetAddressSimilarityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddressSimilarityResponse self = new GetAddressSimilarityResponse();
        return TeaModel.build(map, self);
    }

    public GetAddressSimilarityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddressSimilarityResponse setBody(GetAddressSimilarityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddressSimilarityResponseBody getBody() {
        return this.body;
    }

}
