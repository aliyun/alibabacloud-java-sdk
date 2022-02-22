// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtInternetServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCdtInternetServiceStatusResponseBody body;

    public static GetCdtInternetServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCdtInternetServiceStatusResponse self = new GetCdtInternetServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCdtInternetServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCdtInternetServiceStatusResponse setBody(GetCdtInternetServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCdtInternetServiceStatusResponseBody getBody() {
        return this.body;
    }

}
