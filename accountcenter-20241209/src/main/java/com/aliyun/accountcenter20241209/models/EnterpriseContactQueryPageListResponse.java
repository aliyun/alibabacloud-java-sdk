// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactQueryPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseContactQueryPageListResponseBody body;

    public static EnterpriseContactQueryPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactQueryPageListResponse self = new EnterpriseContactQueryPageListResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactQueryPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseContactQueryPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseContactQueryPageListResponse setBody(EnterpriseContactQueryPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseContactQueryPageListResponseBody getBody() {
        return this.body;
    }

}
