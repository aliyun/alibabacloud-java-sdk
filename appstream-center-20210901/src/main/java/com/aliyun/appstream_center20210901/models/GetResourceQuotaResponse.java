// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceQuotaResponseBody body;

    public static GetResourceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceQuotaResponse self = new GetResourceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceQuotaResponse setBody(GetResourceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceQuotaResponseBody getBody() {
        return this.body;
    }

}
