// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetRenewalRateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRenewalRateListResponseBody body;

    public static GetRenewalRateListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRenewalRateListResponse self = new GetRenewalRateListResponse();
        return TeaModel.build(map, self);
    }

    public GetRenewalRateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRenewalRateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRenewalRateListResponse setBody(GetRenewalRateListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRenewalRateListResponseBody getBody() {
        return this.body;
    }

}
