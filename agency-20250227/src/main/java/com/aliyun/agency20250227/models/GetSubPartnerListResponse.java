// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubPartnerListResponseBody body;

    public static GetSubPartnerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubPartnerListResponse self = new GetSubPartnerListResponse();
        return TeaModel.build(map, self);
    }

    public GetSubPartnerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubPartnerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubPartnerListResponse setBody(GetSubPartnerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubPartnerListResponseBody getBody() {
        return this.body;
    }

}
