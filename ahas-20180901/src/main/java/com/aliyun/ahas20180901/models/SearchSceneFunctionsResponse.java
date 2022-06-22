// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchSceneFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchSceneFunctionsResponseBody body;

    public static SearchSceneFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSceneFunctionsResponse self = new SearchSceneFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public SearchSceneFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSceneFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSceneFunctionsResponse setBody(SearchSceneFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSceneFunctionsResponseBody getBody() {
        return this.body;
    }

}
