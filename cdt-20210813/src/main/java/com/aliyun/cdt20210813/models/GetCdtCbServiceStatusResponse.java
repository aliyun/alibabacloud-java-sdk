// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtCbServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCdtCbServiceStatusResponseBody body;

    public static GetCdtCbServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCdtCbServiceStatusResponse self = new GetCdtCbServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCdtCbServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCdtCbServiceStatusResponse setBody(GetCdtCbServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCdtCbServiceStatusResponseBody getBody() {
        return this.body;
    }

}
