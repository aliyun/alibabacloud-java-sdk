// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateAdvancedSearchFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAggregateAdvancedSearchFileResponseBody body;

    public static CreateAggregateAdvancedSearchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateAdvancedSearchFileResponse self = new CreateAggregateAdvancedSearchFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggregateAdvancedSearchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggregateAdvancedSearchFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggregateAdvancedSearchFileResponse setBody(CreateAggregateAdvancedSearchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregateAdvancedSearchFileResponseBody getBody() {
        return this.body;
    }

}
