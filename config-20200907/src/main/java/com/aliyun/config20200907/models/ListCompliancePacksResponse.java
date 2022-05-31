// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCompliancePacksResponseBody body;

    public static ListCompliancePacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePacksResponse self = new ListCompliancePacksResponse();
        return TeaModel.build(map, self);
    }

    public ListCompliancePacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCompliancePacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCompliancePacksResponse setBody(ListCompliancePacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCompliancePacksResponseBody getBody() {
        return this.body;
    }

}
