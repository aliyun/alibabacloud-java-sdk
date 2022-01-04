// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetEtlResourceUsagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEtlResourceUsagesResponseBody body;

    public static GetEtlResourceUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEtlResourceUsagesResponse self = new GetEtlResourceUsagesResponse();
        return TeaModel.build(map, self);
    }

    public GetEtlResourceUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEtlResourceUsagesResponse setBody(GetEtlResourceUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEtlResourceUsagesResponseBody getBody() {
        return this.body;
    }

}
