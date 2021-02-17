// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageQualityResponseBody body;

    public static GetImageQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageQualityResponse self = new GetImageQualityResponse();
        return TeaModel.build(map, self);
    }

    public GetImageQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageQualityResponse setBody(GetImageQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageQualityResponseBody getBody() {
        return this.body;
    }

}
