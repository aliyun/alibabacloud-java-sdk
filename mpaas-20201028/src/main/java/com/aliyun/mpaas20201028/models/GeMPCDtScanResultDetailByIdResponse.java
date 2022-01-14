// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GeMPCDtScanResultDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GeMPCDtScanResultDetailByIdResponseBody body;

    public static GeMPCDtScanResultDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GeMPCDtScanResultDetailByIdResponse self = new GeMPCDtScanResultDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GeMPCDtScanResultDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeMPCDtScanResultDetailByIdResponse setBody(GeMPCDtScanResultDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GeMPCDtScanResultDetailByIdResponseBody getBody() {
        return this.body;
    }

}
