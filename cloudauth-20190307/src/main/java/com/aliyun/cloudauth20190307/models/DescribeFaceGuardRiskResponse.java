// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceGuardRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFaceGuardRiskResponseBody body;

    public static DescribeFaceGuardRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceGuardRiskResponse self = new DescribeFaceGuardRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceGuardRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaceGuardRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaceGuardRiskResponse setBody(DescribeFaceGuardRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaceGuardRiskResponseBody getBody() {
        return this.body;
    }

}
