// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetWatermarkAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWatermarkAppInfoResponseBody body;

    public static GetWatermarkAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkAppInfoResponse self = new GetWatermarkAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarkAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarkAppInfoResponse setBody(GetWatermarkAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarkAppInfoResponseBody getBody() {
        return this.body;
    }

}
