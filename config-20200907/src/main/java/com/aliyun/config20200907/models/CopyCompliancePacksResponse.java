// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyCompliancePacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyCompliancePacksResponseBody body;

    public static CopyCompliancePacksResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyCompliancePacksResponse self = new CopyCompliancePacksResponse();
        return TeaModel.build(map, self);
    }

    public CopyCompliancePacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyCompliancePacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyCompliancePacksResponse setBody(CopyCompliancePacksResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyCompliancePacksResponseBody getBody() {
        return this.body;
    }

}
