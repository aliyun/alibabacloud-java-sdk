// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetEnterpriseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnterpriseInfoResponseBody body;

    public static GetEnterpriseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseInfoResponse self = new GetEnterpriseInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseInfoResponse setBody(GetEnterpriseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseInfoResponseBody getBody() {
        return this.body;
    }

}
