// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DirectDeductResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DirectDeductResourceResult body;

    public static DirectDeductResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DirectDeductResourcesResponse self = new DirectDeductResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DirectDeductResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DirectDeductResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DirectDeductResourcesResponse setBody(DirectDeductResourceResult body) {
        this.body = body;
        return this;
    }
    public DirectDeductResourceResult getBody() {
        return this.body;
    }

}
