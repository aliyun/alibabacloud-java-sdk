// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataDomainInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataDomainInfoResponseBody body;

    public static GetDataDomainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataDomainInfoResponse self = new GetDataDomainInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDataDomainInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataDomainInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataDomainInfoResponse setBody(GetDataDomainInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataDomainInfoResponseBody getBody() {
        return this.body;
    }

}
