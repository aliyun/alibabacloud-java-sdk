// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataSecondGenerationNoTableFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchFormDataSecondGenerationNoTableFieldResponseBody body;

    public static SearchFormDataSecondGenerationNoTableFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataSecondGenerationNoTableFieldResponse self = new SearchFormDataSecondGenerationNoTableFieldResponse();
        return TeaModel.build(map, self);
    }

    public SearchFormDataSecondGenerationNoTableFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponse setBody(SearchFormDataSecondGenerationNoTableFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFormDataSecondGenerationNoTableFieldResponseBody getBody() {
        return this.body;
    }

}
