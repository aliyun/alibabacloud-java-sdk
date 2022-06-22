// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchSceneFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchSceneFunctionResponseBody body;

    public static SearchSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSceneFunctionResponse self = new SearchSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

    public SearchSceneFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSceneFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSceneFunctionResponse setBody(SearchSceneFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSceneFunctionResponseBody getBody() {
        return this.body;
    }

}
