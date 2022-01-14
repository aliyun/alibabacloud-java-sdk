// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetScanResultDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScanResultDetailByIdResponseBody body;

    public static GetScanResultDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScanResultDetailByIdResponse self = new GetScanResultDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetScanResultDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScanResultDetailByIdResponse setBody(GetScanResultDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScanResultDetailByIdResponseBody getBody() {
        return this.body;
    }

}
