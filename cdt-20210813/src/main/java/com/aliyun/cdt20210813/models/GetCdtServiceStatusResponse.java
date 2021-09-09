// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCdtServiceStatusResponseBody body;

    public static GetCdtServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCdtServiceStatusResponse self = new GetCdtServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCdtServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCdtServiceStatusResponse setBody(GetCdtServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCdtServiceStatusResponseBody getBody() {
        return this.body;
    }

}
