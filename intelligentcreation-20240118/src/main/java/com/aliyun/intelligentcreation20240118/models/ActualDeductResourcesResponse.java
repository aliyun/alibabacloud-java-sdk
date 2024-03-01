// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ActualDeductResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActualDeductResourceResult body;

    public static ActualDeductResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ActualDeductResourcesResponse self = new ActualDeductResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ActualDeductResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActualDeductResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActualDeductResourcesResponse setBody(ActualDeductResourceResult body) {
        this.body = body;
        return this;
    }
    public ActualDeductResourceResult getBody() {
        return this.body;
    }

}
