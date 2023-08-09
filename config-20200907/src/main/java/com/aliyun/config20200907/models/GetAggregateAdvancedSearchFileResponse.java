// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateAdvancedSearchFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateAdvancedSearchFileResponseBody body;

    public static GetAggregateAdvancedSearchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateAdvancedSearchFileResponse self = new GetAggregateAdvancedSearchFileResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateAdvancedSearchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateAdvancedSearchFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateAdvancedSearchFileResponse setBody(GetAggregateAdvancedSearchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateAdvancedSearchFileResponseBody getBody() {
        return this.body;
    }

}
