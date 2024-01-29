// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteCompliancePacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCompliancePacksResponseBody body;

    public static DeleteCompliancePacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompliancePacksResponse self = new DeleteCompliancePacksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCompliancePacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCompliancePacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCompliancePacksResponse setBody(DeleteCompliancePacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCompliancePacksResponseBody getBody() {
        return this.body;
    }

}
