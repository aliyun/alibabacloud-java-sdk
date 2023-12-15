// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetPartnerByUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPartnerByUidResponseBody body;

    public static GetPartnerByUidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPartnerByUidResponse self = new GetPartnerByUidResponse();
        return TeaModel.build(map, self);
    }

    public GetPartnerByUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPartnerByUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPartnerByUidResponse setBody(GetPartnerByUidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPartnerByUidResponseBody getBody() {
        return this.body;
    }

}
