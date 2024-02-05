// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataSecondGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchFormDataSecondGenerationResponseBody body;

    public static SearchFormDataSecondGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataSecondGenerationResponse self = new SearchFormDataSecondGenerationResponse();
        return TeaModel.build(map, self);
    }

    public SearchFormDataSecondGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFormDataSecondGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFormDataSecondGenerationResponse setBody(SearchFormDataSecondGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFormDataSecondGenerationResponseBody getBody() {
        return this.body;
    }

}
