// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ExpectDeductResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExpectDeductResourceResult body;

    public static ExpectDeductResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpectDeductResourcesResponse self = new ExpectDeductResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ExpectDeductResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpectDeductResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExpectDeductResourcesResponse setBody(ExpectDeductResourceResult body) {
        this.body = body;
        return this;
    }
    public ExpectDeductResourceResult getBody() {
        return this.body;
    }

}
