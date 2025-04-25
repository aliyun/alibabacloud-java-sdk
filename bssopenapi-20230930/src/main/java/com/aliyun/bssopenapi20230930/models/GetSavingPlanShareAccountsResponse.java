// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanShareAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSavingPlanShareAccountsResponseBody body;

    public static GetSavingPlanShareAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanShareAccountsResponse self = new GetSavingPlanShareAccountsResponse();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanShareAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSavingPlanShareAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSavingPlanShareAccountsResponse setBody(GetSavingPlanShareAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSavingPlanShareAccountsResponseBody getBody() {
        return this.body;
    }

}
