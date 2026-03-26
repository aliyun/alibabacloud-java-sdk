// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightSelectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInsightSelectorsResponseBody body;

    public static GetInsightSelectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInsightSelectorsResponse self = new GetInsightSelectorsResponse();
        return TeaModel.build(map, self);
    }

    public GetInsightSelectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInsightSelectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInsightSelectorsResponse setBody(GetInsightSelectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInsightSelectorsResponseBody getBody() {
        return this.body;
    }

}
