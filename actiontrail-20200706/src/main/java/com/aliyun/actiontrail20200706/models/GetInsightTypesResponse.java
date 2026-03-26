// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInsightTypesResponseBody body;

    public static GetInsightTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInsightTypesResponse self = new GetInsightTypesResponse();
        return TeaModel.build(map, self);
    }

    public GetInsightTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInsightTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInsightTypesResponse setBody(GetInsightTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInsightTypesResponseBody getBody() {
        return this.body;
    }

}
