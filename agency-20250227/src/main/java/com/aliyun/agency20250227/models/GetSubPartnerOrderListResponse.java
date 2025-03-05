// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerOrderListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubPartnerOrderListResponseBody body;

    public static GetSubPartnerOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubPartnerOrderListResponse self = new GetSubPartnerOrderListResponse();
        return TeaModel.build(map, self);
    }

    public GetSubPartnerOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubPartnerOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubPartnerOrderListResponse setBody(GetSubPartnerOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubPartnerOrderListResponseBody getBody() {
        return this.body;
    }

}
