// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactQueryDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseContactQueryDetailResponseBody body;

    public static EnterpriseContactQueryDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactQueryDetailResponse self = new EnterpriseContactQueryDetailResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactQueryDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseContactQueryDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseContactQueryDetailResponse setBody(EnterpriseContactQueryDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseContactQueryDetailResponseBody getBody() {
        return this.body;
    }

}
